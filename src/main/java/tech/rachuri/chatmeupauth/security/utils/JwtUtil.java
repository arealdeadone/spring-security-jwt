package tech.rachuri.chatmeupauth.security.utils;

import java.util.Date;
import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;

import io.jsonwebtoken.Claims;

public interface JwtUtil {

	String extractUsername(String token);
	Date extractExpiration(String token);
	<T> T extractClaim(String token, Function<Claims, T> claimsResolver);
	String generateToken(UserDetails userDetails);
	Boolean validateToken(String token, UserDetails userDetails);
	String whatIsMySecret();
}
