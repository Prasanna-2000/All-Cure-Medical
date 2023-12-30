const disableCheckBox = document.getElementsByTagName("input");
// Retrieve reference to button
    var submitButton = document.getElementById("submit");

    submitButton.onclick = function(){
    var status = CheckBoxCount()
    if (status) {
        submitButton.disabled = true;
        alert("Minimum 2 and maximum 6 can be selected")
        location.reload()
     } else {
        submitButton.disabled = false;
     }
    };

    function CheckBoxCount() {
        var inputList = disableCheckBox;
        console.log(inputList)
        var numChecked = 0;

        for (var i = 0; i < inputList.length; i++) {
            if (inputList[i].type == "checkbox" && inputList[i].checked) {
                numChecked = numChecked + 1;
            }
        }
        if (numChecked < 2) {
            // alert("Minimum 2 !"); 
            return true;
        } else if (numChecked > 6) {
            // 
            return true;
        }
        return false;
    }