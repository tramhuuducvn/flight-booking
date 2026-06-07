# RESTful APIs

## Get flights

1. Endpoints:
    ```bash
    GET http://localhost:8081/api/v1/flights
    ```

2. Parameters:
   - Use for management, usually on web application
     - page: a non-negative integer number
     - size: a positive integer number
   - Use for mobile app
     - offset: a non-negative integer number
     - limit: a positive integer number

