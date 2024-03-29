# Spring Boot Template

![CI Status](https://github.com/lomasz/spring-boot-template/workflows/CI/badge.svg)

* spring boot + web + jpa + rest
* gradle wrapper
* lombok
* h2 (embedded)
* junit 5
* jacoco
* k8s/helm
* make

## :memo: Prerequisites

Before you begin, ensure you have met the following requirements:

* `make`
* `pre-commit`
* `docker` + `kubectl`
* `helm`
* `hadolint`
* `jq`
* `awslocal`

For :apple: macOS users, you can use the [`Brewfile`](Brewfile) script to simplify the installation of all the
necessary dependencies.

If you have Homebrew installed, follow these steps:

```bash
brew bundle
````

## :rocket: Getting Started

To see a list of available commands, run command:

```bash
make
```

## :recycle: Reuse Instructions

This project includes a convenient script to help you quickly set up and customize the template for your specific needs.
The [`generate.sh`](generate.sh) script allows you to update the application name, port number and package name with ease.

**Usage**

To use the script run the following command:

```
./generate.sh [OPTIONS]

Options:
  --name       new app name, this option cannot be used together with --auto-name
  --port       new port number
  --package    new package name
  --auto-name  set app name to the current directory name, this option cannot be used together with --name
```

**Examples**

To set the application name to `my-app`, use port `8080`, and set the package name to `com.example.myapp`:

```bash
./generate.sh --name my-app --port 8080 --package com.example.myapp
```

To automatically use the name of the current directory as the application name:

```bash
./generate.sh --auto-name
```

Using this script simplifies the process of adapting the template to your project's requirements, allowing you to get
started with your custom application more quickly.

## :stethoscope: Actuator

* [`http://localhost:4326/actuator/health`](http://localhost:4326/actuator/health) - health information (status)

## :sunglasses: API Documentation

* [`http://localhost:4326/v3/api-docs`](http://localhost:4326/v3/api-docs) - API Docs [JSON]
* [`http://localhost:4326/v3/api-docs.yaml`](http://localhost:4326/v3/api-docs.yaml) - API Docs [YAML]
* [`http://localhost:4326/swagger-ui.html`](http://localhost:4326/swagger-ui.html) - Swagger UI
