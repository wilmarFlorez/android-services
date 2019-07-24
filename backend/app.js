const express = require('express')
const bodyParser = require('body-parser')
const app = express()
const port = 3000

app.use(bodyParser.urlencoded({ extended: true }))
app.use(bodyParser.json())

app.get('/', (request, response) => {
    console.log('Hello World')
    response.json({ 'Hello': 'World!' })
})

app.post('/save', (request, response) => {
    if (!request || !request.body) {
        response.json({ 'success': false, result: null, message: 'Add a body' })
    }

    response.json({ 'success': true, result: request.body, message: 'Ok' })
})

app.get('/get-my-friends', (req, res) => {
    console.log('Hello again')
    res.json({
        'user': [
            {
                "id": "1",
                "name": "Raj Amal",
                "email": "raj.amalw@gmail.com"
            }, {
                "id": "2",
                "name": "sunil",
                "email": "sunil@gmail.com"
            }, {
                "id": "3",
                "name": "Awadhesh",
                "email": "awadesh@gmail.com"
            }, {
                "id": "4",
                "name": "Sandy",
                "email": "sandy@gmail.com"
            }, {
                "id": "5",
                "name": "Jitendra",
                "email": "jda@gmail.com"
            }]
    })
}
)

app.listen(port, () => {
    console
        .log(`Server running at http://localhost:${port}/`)
})