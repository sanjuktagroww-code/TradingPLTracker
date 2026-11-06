# Trading P&L Tracker

A personal, offline-first Android P&L tracker. Trade records are stored locally on the device using WebView local storage.

## Build

Run `gradle assembleDebug` with JDK 17 and Android SDK installed. The GitHub Actions workflow builds a debug APK and uploads it as an artifact.

## Features
- Premium dark interface
- Add CE, PE, futures and other trade records
- BUY/SELL P&L calculation using lots, lot size and charges
- Open trade status when exit price is blank
- Eight member tags
- Export a JSON backup

All figures start at zero. This app does not connect to a broker or provide trading advice.
