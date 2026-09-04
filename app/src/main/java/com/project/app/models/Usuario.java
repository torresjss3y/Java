package com.project.app.models;

import java.time.OffsetDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users", schema = "auth")
public class Usuario {

    @Id
    @Column(name = "id")
    private UUID id; // Mapea a UID (UUID)

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "created_at", insertable = false, updatable = false)
    private OffsetDateTime createdAt;

    @Column(name = "last_sign_in_at")
    private OffsetDateTime lastSignInAt;

    // Supabase guarda el Display Name, avatars y datos de OAuth dentro de raw_user_meta_data (JSONB)
    @Column(name = "raw_user_meta_data", columnDefinition = "jsonb")
    private String rawUserMetaData;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public OffsetDateTime getLastSignInAt() {
        return lastSignInAt;
    }

    public void setLastSignInAt(OffsetDateTime lastSignInAt) {
        this.lastSignInAt = lastSignInAt;
    }

    public String getRawUserMetaData() {
        return rawUserMetaData;
    }

    public void setRawUserMetaData(String rawUserMetaData) {
        this.rawUserMetaData = rawUserMetaData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario{");
        sb.append("id=").append(id);
        sb.append(", email=").append(email);
        sb.append(", phone=").append(phone);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", lastSignInAt=").append(lastSignInAt);
        sb.append(", rawUserMetaData=").append(rawUserMetaData);
        sb.append('}');
        return sb.toString();
    }

    
}