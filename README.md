# Company API

## Endpoints

### GET /companies/{id}

**Response:**

{
  "id": 1,
  "name": "Company Name"
}


GET /companies/{id}/employees

[
{
"id": 1,
"name": "Employee Name",
"age": 30,
"gender": "Male",
"Salary": 1000
},
]

GET /companies?page=1&size=5

[{ "id": 1, "name": "Company Name" },]

PUT /employees/{id}

request body
{
"name": "Updated Employee Name",
"age": 30,
"gender": "Male",
"Salary": 1000,
"companyId": 1
}

response body
{
"name": "Updated Employee Name",
"age": 30,
"gender": "Male",
"Salary": 1000,
"companyId": 1
}

POST /companies

Request
{
"id": 1,
"name": "New Company Name"
}
Response
{
"id": 1,
"name": "New Company Name"
}

DELETE /companies/{id}

Response:
204 No Content