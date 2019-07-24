# android-services
Short demo to demonstrate how to consume REST API's

You can find two projects, the first one is the mobile app written in Kotlin for Android and the second is a simple backend to retrieve some data.

## Backend

### Development

Place your console (CMD or Powershell) in the root of project (/backend) and install with the following command:

> npm install
> code .

Now you can start developing the backend.

### Execution

> node app.js

or 

> F5 in VS Code

### Tunnel forwarding

Is important to expose the service to Internet with the following command in a Powershell:

> ./ngrok http 3000