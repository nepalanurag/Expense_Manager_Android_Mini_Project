# Expense Manager (Android Mini Project)

An Android app for tracking daily expenses, built with an MVP structure on SQLite.

## What it does

From reading the code (this needs Android Studio and a device/emulator to run, so the walkthrough below is from the source):

- Add an expense with an amount, a category, and the date it was logged. Categories come with presets (Food, Transport, Transfer, Rent, Other) and you can add your own from the navigation drawer.
- Browse what you spent today, this week, and this month in three separate views.
- The month view shows a bar chart of spending grouped by category (via the holo-graph library) plus the month's total.
- Everything is stored in a local SQLite database (`ExpenseDatabaseHelper`); there is no login, no sync, and no budget tracking.

## Installation

Open the project in Android Studio, connect a device (or start an emulator), and build and run the `app` module. The project includes the Gradle wrapper (`gradlew`), so no extra Gradle install is needed.

```bash
./gradlew assembleDebug
```
