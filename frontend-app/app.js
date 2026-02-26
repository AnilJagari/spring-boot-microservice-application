const API = "http://localhost:8081/api/students";

async function loadStudents() {
    const res = await fetch(API);
    const students = await res.json();

    const list = document.getElementById("studentList");
    list.innerHTML = "";

    students.forEach(s => {
        const li = document.createElement("li");
        li.textContent = s.name + " - " + s.course;
        list.appendChild(li);
    });
}

async function addStudent() {
    const student = {
        name: document.getElementById("name").value,
        email: document.getElementById("email").value,
        course: document.getElementById("course").value
    };

    await fetch(API, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(student)
    });

    loadStudents();
}