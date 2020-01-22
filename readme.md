## What is the context of this repository?
Here an annotation named `@EmailValidator` is created to validate user email.

## How It works?
When user input his/her email it will check the email is matched with the specified domain or not.  
Like your company email is `yourname@example.com`. Here `example.com` is your company domain and its fixed.  
Application will only accept this domain email as user email. 

## How you will use this with your domain email?
Copy the `util` package from this application and replace `example.com` by your domain from `ExampleEmailValidator.java` file.  
Then use the `@EmailValidator` annotation in your model class like `User.java` file in model package.
