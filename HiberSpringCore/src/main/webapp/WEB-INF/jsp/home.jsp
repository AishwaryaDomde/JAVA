
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  <style>
    .View_middle {
      min-height: 100%;
      /* Fallback for browsers do NOT support vh unit */
      min-height: 100vh;
      /* These two lines are counted as one :-)       */
      display: flex;
      align-items: center;
    }
  </style>
</head>

<body>

  <div class="container ">
    <div class="View_middle">
      <div class="card bg-light text-dark">
        <div class="card-body">
          <form action="addPerson" class="needs-validation" novalidate>
            <div class="row">
              <div class="col-sm-6">
                <div class="form-group">
                  <label for="uname">FirstName:</label>
                  <input type="text" class="form-control" id="uname" placeholder="Enter username" name="fname" required>
                  <div class="valid-feedback">Valid.</div>
                  <div class="invalid-feedback">Please fill out this field.</div>
                </div>
              </div>
              <div class="col-sm-6">
                <div class="form-group">
                  <label for="uname">Last Name:</label>
                  <input type="text" class="form-control" id="uname" placeholder="Enter username" name="lname" required>
                  <div class="valid-feedback">Valid.</div>
                  <div class="invalid-feedback">Please fill out this field.</div>
                </div>
              </div>
              <div class="col-sm-6">
                <div class="form-group">
                  <label for="uname">Email:</label>
                  <input type="text" class="form-control" id="uname" placeholder="Enter username" name="email" required>
                  <div class="valid-feedback">Valid.</div>
                  <div class="invalid-feedback">Please fill out this field.</div>
                </div>
              </div>
              <div class="col-sm-6">
                <div class="form-group">
                  <label for="uname">Gender:</label>
                  <input type="text" class="form-control" id="uname" placeholder="Enter username" name="gender" required>
                  <div class="valid-feedback">Valid.</div>
                  <div class="invalid-feedback">Please fill out this field.</div>
                </div>
              </div>
              <div class="col-sm-6">
                <div class="form-group">
                  <label for="uname">Contact No:</label>
                  <input type="text" class="form-control" id="uname" placeholder="Enter username" name="contact" required>
                  <div class="valid-feedback">Valid.</div>
                  <div class="invalid-feedback">Please fill out this field.</div>
                </div>
              </div>
              <div class="col-sm-6">
                <div class="form-group">
                  <label for="pwd">Password:</label>
                  <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pswd"
                    required>
                  <div class="valid-feedback">Valid.</div>
                  <div class="invalid-feedback">Please fill out this field.</div>
                </div>
              </div>
              <div class="col-sm-6">
                <button type="submit" class="btn btn-primary">Submit</button>
              </div>
            </div>
          </form>
        </div>
      </div>
    </div>
  </div>
  <script>
    // Disable form submissions if there are invalid fields
    (function () {
      'use strict';
      window.addEventListener('load', function () {
        // Get the forms we want to add validation styles to
        var forms = document.getElementsByClassName('needs-validation');
        // Loop over them and prevent submission
        var validation = Array.prototype.filter.call(forms, function (form) {
          form.addEventListener('submit', function (event) {
            if (form.checkValidity() === false) {
              event.preventDefault();
              event.stopPropagation();
            }
            form.classList.add('was-validated');
          }, false);
        });
      }, false);
    })();
  </script>

</body>

</html>