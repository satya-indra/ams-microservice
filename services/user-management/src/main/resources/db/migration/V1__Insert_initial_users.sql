-- File: user-management/src/main/resources/db/migration/V2__Create_schema_and_insert_dummy_users.sql

-- Create Users table schema
CREATE TABLE IF NOT EXISTS Users (
    id UUID PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    firstName VARCHAR(50) NOT NULL,
    lastName VARCHAR(50) NOT NULL,
    dateRegistered TIMESTAMP NOT NULL,
    lastLogin TIMESTAMP NOT NULL,
    isActive BOOLEAN NOT NULL,
    user_type VARCHAR(50) NOT NULL,
    isOwner BOOLEAN,
    vendorDetails VARCHAR(255),
    visitPurpose VARCHAR(255),
    adminRole VARCHAR(255)
);

-- Insert 10 dummy users
INSERT INTO Users (id, username, password, email, firstName, lastName, dateRegistered, lastLogin, isActive, user_type, isOwner, vendorDetails, visitPurpose, adminRole)
VALUES
  ('550e8400-e29b-41d4-a716-446655440002', 'resident1', 'password123', 'resident1@example.com', 'Resident', 'One', '2023-01-01', '2023-01-02', true, 'Resident', true, NULL, NULL, NULL),
  ('550e8400-e29b-41d4-a716-446655440003', 'vendor1', 'password123', 'vendor1@example.com', 'Vendor', 'One', '2023-01-01', '2023-01-02', true, 'Vendor', NULL, 'Details for vendor1', NULL, NULL),
  ('550e8400-e29b-41d4-a716-446655440004', 'visitor1', 'password123', 'visitor1@example.com', 'Visitor', 'One', '2023-01-01', '2023-01-02', true, 'Visitor', NULL, NULL, 'Purpose for visitor1', NULL),
  ('550e8400-e29b-41d4-a716-446655440005', 'admin1', 'password123', 'admin1@example.com', 'Admin', 'One', '2023-01-01', '2023-01-02', true, 'Admin', NULL, NULL, NULL, 'Role for admin1'),
  ('550e8400-e29b-41d4-a716-446655440006', 'resident2', 'password123', 'resident2@example.com', 'Resident', 'Two', '2023-01-01', '2023-01-02', true, 'Resident', false, NULL, NULL, NULL),
  ('550e8400-e29b-41d4-a716-446655440007', 'vendor2', 'password123', 'vendor2@example.com', 'Vendor', 'Two', '2023-01-01', '2023-01-02', true, 'Vendor', NULL, 'Details for vendor2', NULL, NULL),
  ('550e8400-e29b-41d4-a716-446655440008', 'visitor2', 'password123', 'visitor2@example.com', 'Visitor', 'Two', '2023-01-01', '2023-01-02', true, 'Visitor', NULL, NULL, 'Purpose for visitor2', NULL),
  ('550e8400-e29b-41d4-a716-446655440009', 'admin2', 'password123', 'admin2@example.com', 'Admin', 'Two', '2023-01-01', '2023-01-02', true, 'Admin', NULL, NULL, NULL, 'Role for admin2'),
  ('550e8400-e29b-41d4-a716-446655440010', 'resident3', 'password123', 'resident3@example.com', 'Resident', 'Three', '2023-01-01', '2023-01-02', true, 'Resident', true, NULL, NULL, NULL),
  ('550e8400-e29b-41d4-a716-446655440011', 'vendor3', 'password123', 'vendor3@example.com', 'Vendor', 'Three', '2023-01-01', '2023-01-02', true, 'Vendor', NULL, 'Details for vendor3', NULL, NULL);