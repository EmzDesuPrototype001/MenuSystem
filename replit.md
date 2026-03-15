# Cafe Ordering System

## Overview
A web-based Cafe Ordering System converted from the original Java Swing desktop application. Users can select menu items across four categories, apply discounts, choose a payment method, and generate a receipt.

## Project Structure
- `CafeMenu/` — Original Java Swing source code and compiled classes (reference only)
- `cafe-web/` — Web application
  - `index.html` — Main HTML/CSS/JS app (single-page, no build step required)
  - `server.py` — Simple Python HTTP server serving the static files on port 5000

## Running the App
The workflow "Start application" runs `python cafe-web/server.py`, serving on `http://0.0.0.0:5000`.

## Menu Categories
- **Coffee**: Espresso, Americano, Cappuccino, Caramel Latte, Mocha
- **Non-Coffee**: Hot Chocolate, Fresh Lemonade, Matcha Latte, Strawberry Milk
- **Pastries**: Croissant, Chocolate Croissant, Blueberry Muffin, Banana Bread, Cinnamon Roll
- **Desserts**: Cheesecake, Chocolate Cake, Brownies, Donut, Ice Cream

## Features
- Checkbox + quantity selection per item with price display
- Student (10%) and Senior Citizen (20%) discounts
- Cash or Online payment method
- Receipt generation with itemized list and total
- Clear button to reset all inputs

## Deployment
Configured as a **static** deployment with `publicDir: cafe-web`.
