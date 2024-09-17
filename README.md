# dvfa - Damn Vulnerable Flutter App


A intentionally insecure Flutter app.

This application contains a variety of security vulnerabilities:

- outdated or insecure dependencies
- WIP: user input is not validated and will trigger various issues like path traversal (Flutter/Dart)
- WIP: native components are written without sanitisation or validation either

## Latest Tested versions

- Flutter: 3.24.1
- Java 22


## SBOM testing

This repository contains 3 sample SBOM files.

Regenerating the files requires a full build to work beforehand (`flutter build`)

| File              | Description                          | How to generate                                                                              |
| ----------------- | ------------------------------------ | -------------------------------------------------------------------------------------------- |
| sbom-pub.json     | SBOM for pub dependencies only       | `cdxgen -t pub -o sbom-pub.json`                                                             |
| sbom-android.json | SBOM for Android native dependencies | `cd android && snyk sbom --format "cyclonedx1.5+json" --all-projects > ../sbom-android.json` |
| sbom-ios.json     | SBOM for iOS native dependencies     | `cd ios && snyk sbom --format "cyclonedx1.5+json" > ../sbom-ios.json`                        |