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

INSERT INTO menu_options (role_id, name, content, menu_order)
SELECT 1, 'dashboard', 'Dashboard', 50
WHERE NOT EXISTS (SELECT 1 FROM menu_options WHERE role_id = 1 AND name = 'dashboard');

-- Menú para rol 2
INSERT INTO menu_options (role_id, name, content, menu_order)
SELECT 2, 'customers', 'Customers', 10
WHERE NOT EXISTS (SELECT 1 FROM menu_options WHERE role_id = 2 AND name = 'customers');

INSERT INTO menu_options (role_id, name, content, menu_order)
SELECT 2, 'about', 'About', 20
WHERE NOT EXISTS (SELECT 1 FROM menu_options WHERE role_id = 2 AND name = 'about');

INSERT INTO menu_options (role_id, name, content, menu_order)
SELECT 2, 'dashboard', 'Dashboard', 30
WHERE NOT EXISTS (SELECT 1 FROM menu_options WHERE role_id = 2 AND name = 'dashboard');

-- Dashboard stats
INSERT INTO dashboard_stats (id, completed, pending, cancelled)
SELECT 1, 120, 45, 10
WHERE NOT EXISTS (
    SELECT 1 FROM dashboard_stats WHERE id = 1
);

-- Monthly sales
INSERT INTO monthly_sales (month_name, total, sort_order)
SELECT 'Enero', 1200, 1
WHERE NOT EXISTS (
    SELECT 1 FROM monthly_sales WHERE month_name = 'Enero'
);

INSERT INTO monthly_sales (month_name, total, sort_order)
SELECT 'Febrero', 1800, 2
WHERE NOT EXISTS (
    SELECT 1 FROM monthly_sales WHERE month_name = 'Febrero'
);

INSERT INTO monthly_sales (month_name, total, sort_order)
SELECT 'Marzo', 900, 3
WHERE NOT EXISTS (
    SELECT 1 FROM monthly_sales WHERE month_name = 'Marzo'
);

INSERT INTO monthly_sales (month_name, total, sort_order)
SELECT 'Abril', 2200, 4
WHERE NOT EXISTS (
    SELECT 1 FROM monthly_sales WHERE month_name = 'Abril'
);

INSERT INTO monthly_sales (month_name, total, sort_order)
SELECT 'Mayo', 3100, 5
WHERE NOT EXISTS (
    SELECT 1 FROM monthly_sales WHERE month_name = 'Mayo'
);

-- Top products
INSERT INTO top_products (name, total)
SELECT 'Laptop', 35
WHERE NOT EXISTS (
    SELECT 1 FROM top_products WHERE name = 'Laptop'
);

INSERT INTO top_products (name, total)
SELECT 'Mouse', 80
WHERE NOT EXISTS (
    SELECT 1 FROM top_products WHERE name = 'Mouse'
);

INSERT INTO top_products (name, total)
SELECT 'Teclado', 40
WHERE NOT EXISTS (
    SELECT 1 FROM top_products WHERE name = 'Teclado'
);

INSERT INTO top_products (name, total)
SELECT 'Monitor', 25
WHERE NOT EXISTS (
    SELECT 1 FROM top_products WHERE name = 'Monitor'
);

-- Product strategy: datos multidimensionales
INSERT INTO product_strategy (name, sales, avg_ticket, margin, stock_risk)
SELECT 'Laptop', 35, 2500, 28, 'Medio'
WHERE NOT EXISTS (
    SELECT 1 FROM product_strategy WHERE name = 'Laptop'
);

INSERT INTO product_strategy (name, sales, avg_ticket, margin, stock_risk)
SELECT 'Mouse', 80, 45, 45, 'Bajo'
WHERE NOT EXISTS (
    SELECT 1 FROM product_strategy WHERE name = 'Mouse'
);

INSERT INTO product_strategy (name, sales, avg_ticket, margin, stock_risk)
SELECT 'Teclado', 40, 120, 35, 'Medio'
WHERE NOT EXISTS (
    SELECT 1 FROM product_strategy WHERE name = 'Teclado'
);

INSERT INTO product_strategy (name, sales, avg_ticket, margin, stock_risk)
SELECT 'Monitor', 25, 800, 22, 'Alto'
WHERE NOT EXISTS (
    SELECT 1 FROM product_strategy WHERE name = 'Monitor'
);