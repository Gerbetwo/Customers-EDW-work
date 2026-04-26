-- Contraseñas en texto plano: "admin123", "user123"
-- Hashes generados con BCrypt (10 rondas):
INSERT INTO users (username, password, role) VALUES
('admin', '$2a$10$N9qo8uLOickgx2ZMRZoMyeIjZAgcfl7p92ldGxad68LJZdL17lhWy', 'ROLE_1'),
('user', '$2a$10$EixZaYVK1fsbw1ZfbX3OXe.PrO/SxwtAM/X1mXmHDiPp5DfMPHSiC', 'ROLE_2')
ON CONFLICT (username) DO NOTHING;