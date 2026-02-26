//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import io.jsonwebtoken.security.Keys;
//import org.springframework.stereotype.Component;
//
//import javax.crypto.SecretKey;
//import java.util.Date;
//
//@Component
//public class JwtUtil {
//
//    private final SecretKey key = Keys.hmacShaKeyFor(
//            "mysecretkeymysecretkeymysecretkey12".getBytes()
//    );
//
//    // 🔥 Generate Token
//    public String generateToken(String username) {
//        return Jwts.builder()
//                .setSubject(username)
//                .setIssuer("anil-api-gateway")
//                .setIssuedAt(new Date())
//                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60)) // 1 hour
//                .signWith(key, SignatureAlgorithm.HS256)
//                .compact();
//    }
//
//    // Existing methods for validation come here...
//}
