const express = require('express');
const app = express();
const port = 3006;

app.get('/', (req, res) => {
    res.send('Hello from Node.js with Express!');
});

app.listen(port, () => {
    console.log(`Server is running on port ${port}`);
});