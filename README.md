# AEM Third-Party API Integration

This project demonstrates how to integrate a third-party API with Adobe Experience Manager (AEM) using OSGi services and Sling Models. Additionally, it outlines an approach for client-side rendering.

## Prerequisites

- **Java 11**: Ensure that Java 11 is installed on your machine.
- **Maven 3.8.5**: Ensure that Maven 3.8.5 is installed on your machine.
- AEM Author instance running locally.

## Getting Started

Follow these steps to set up and test the project locally.

### 1. Run AEM Author Instance

Ensure that your AEM Author instance is running on your local machine.

### 2. Build and Install the Project

Navigate to the root directory of the project and run the following Maven command:

```sh
mvn clean install -PautoInstallPackage
```
## 3. Create Mock API Data

1. Go to [Mocki.io](https://mocki.io).

2. Create a new mock API URL with the following JSON data:

    ```json
    {
        "medical_providers": [
            {
                "id": 1,
                "first_name": "John",
                "middle_name": "Michael",
                "last_name": "Doe",
                "facility": "Anytown Cardiology Clinic",
                "specialty": "Cardiology",
                "image": "https://example.com/dr-john-doe.jpg",
                "phone": "555-1234",
                "email": "john.doe@clinic.com",
                "location": {
                    "address": "123 Main St",
                    "city": "Anytown",
                    "state": "CA",
                    "zip": "12345"
                },
                "credentials": {
                    "medical_school": "University of Medicine",
                    "board_certifications": [
                        "American Board of Internal Medicine",
                        "American Board of Cardiovascular Disease"
                    ],
                    "years_of_experience": 15
                },
                "reviews": [
                    {
                        "rating": 4.8,
                        "comment": "Dr. Doe was very knowledgeable and took the time to explain everything clearly.",
                        "author": "Jane Smith"
                    },
                    {
                        "rating": 4.5,
                        "comment": "I had a great experience with Dr. Doe. He provided excellent care and was very patient.",
                        "author": "Michael Johnson"
                    }
                ],
                "services": [
                    {
                        "name": "Cardiac Consultation",
                        "description": "Comprehensive evaluation and treatment of heart-related conditions.",
                        "price": 250
                    },
                    {
                        "name": "Echocardiogram",
                        "description": "Diagnostic imaging test to evaluate the structure and function of the heart.",
                        "price": 350
                    },
                    {
                        "name": "Stress Test",
                        "description": "Evaluation of the heart's response to physical activity.",
                        "price": 300
                    }
                ]
            }
        ]
    }
    ```

## 4. Configure the Provider API URL

1. Open your web browser and go to `http://localhost:4502/system/console/configMgr`.

2. Search for "Provider Service Configuration".

3. Click on the configuration and then click "Edit".

4. Fill in the "Provider API URL" field with the mock API URL you created earlier.

5. Click "Save".


## 5. Test Using Sample Content

To verify that the integration is working correctly, follow these steps:

1. Open your web browser and navigate to [http://localhost:4502/aem/start.html](http://localhost:4502/aem/start.html).

2. Go to the **Sites** section.

3. Expand the `aem-third-party-api-integration` folder.

4. Expand either the **English** or **Spanish** folder, depending on your preference.

5. Select the `aem-third-party-api-integration` page.

6. Click **Edit** to open the page editor.

7. In the page editor, click **"Drag components here"** to start adding components.

8. Click the **plus sign (+)** to open the component selection menu.

9. Select the `aem-third-party-api-integration` component from the list.

10. You should now be able to see and interact with the component on the page.

This will allow you to test the component and verify that it is functioning as expected.
