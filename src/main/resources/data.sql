-- Menú para rol 1
INSERT INTO menu_options (role_id, name, content, menu_order)
SELECT 1, 'customers', 'Customers', 10
WHERE NOT EXISTS (SELECT 1 FROM menu_options WHERE role_id = 1 AND name = 'customers');

INSERT INTO menu_options (role_id, name, content, menu_order)
SELECT 1, 'departments', 'Departments', 20
WHERE NOT EXISTS (SELECT 1 FROM menu_options WHERE role_id = 1 AND name = 'departments');

INSERT INTO menu_options (role_id, name, content, menu_order)
SELECT 1, 'tmo', 'TMO', 30
WHERE NOT EXISTS (SELECT 1 FROM menu_options WHERE role_id = 1 AND name = 'tmo');

INSERT INTO menu_options (role_id, name, content, menu_order)
SELECT 1, 'about', 'About', 40
WHERE NOT EXISTS (SELECT 1 FROM menu_options WHERE role_id = 1 AND name = 'about');

-- Menú para rol 2
INSERT INTO menu_options (role_id, name, content, menu_order)
SELECT 2, 'customers', 'Customers', 10
WHERE NOT EXISTS (SELECT 1 FROM menu_options WHERE role_id = 2 AND name = 'customers');

INSERT INTO menu_options (role_id, name, content, menu_order)
SELECT 2, 'about', 'About', 20
WHERE NOT EXISTS (SELECT 1 FROM menu_options WHERE role_id = 2 AND name = 'about');