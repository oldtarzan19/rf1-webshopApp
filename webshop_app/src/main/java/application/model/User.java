package application.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class User implements UserDetails {

  private static final long serialVersionUID = 1L;

  int id;

  String felhasznalonev;
  String email;
  String password;

  String cim;

  float felhasznalhato_keret;
  String role;

  public User() {}

  public User(int id,String felhasznalonev, String email, String password,String cim,float felhasznalhato_keret, String role) {
    this.id = id;
    this.felhasznalonev=felhasznalonev;
    this.email = email;
    this.password = password;
    this.cim=cim;
    this.felhasznalhato_keret=felhasznalhato_keret;
    this.role = role;
  }

  public User(String felhasznalonev,String email, String password,String cim) {
    this.felhasznalonev=felhasznalonev;
    this.cim=cim;
    this.email = email;
    this.password = password;
    this.felhasznalhato_keret=10.0f;
    this.role = "ROLE_USER";
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getFelhasznalonev() {
    return felhasznalonev;
  }

  public void setFelhasznalonev(String felhasznalonev) {
    this.felhasznalonev = felhasznalonev;
  }

  public String getCim() {
    return cim;
  }

  public void setCim(String cim) {
    this.cim = cim;
  }

  public float getFelhasznalhato_keret() {
    return felhasznalhato_keret;
  }

  public void setFelhasznalhato_keret(float felhasznalhato_keret) {
    this.felhasznalhato_keret = felhasznalhato_keret;
  }

  @Override
  public String toString() {
    return "User [id=" + id + ", felhasznalonev="+felhasznalonev+", email=" + email + ", password=" + password + ", cim="+cim+", felhasznalhato keret="+felhasznalhato_keret+", role=" + role + "]";
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }

  @Override
  public Collection < ? extends GrantedAuthority > getAuthorities() {
    Set < GrantedAuthority > authorities = new HashSet < GrantedAuthority > ();
    authorities.add(new SimpleGrantedAuthority(this.role));
    return authorities;
  }

  @Override
  public String getUsername() {
    return this.email;
  }

}