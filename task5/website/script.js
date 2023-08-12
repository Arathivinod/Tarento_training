function savePassword() {
	var websiteInp = document.getElementById("website");
	var usernameInp = document.getElementById("username");
	var passwordInp = document.getElementById("password");

	var website = websiteInp.value;
	var username = usernameInp.value;
	var password = passwordInp.value;

	var passwordItem = document.createElement("li");
	passwordItem.innerHTML = "<strng>Wbesite:</strong>" + website + ", <strong>Username:</strong>" + username + ", <strong>Password:</strong>" + password;
	document.getElementById("passwordList").appendChild(passwordItem);

	websiteInp.value="";
	usernameInp.value="";
	passwordInp.value="";
}
