$('#make').on('change', function () {
    $.ajax({
        url: "http://localhost:8080/storageManager/phoneModelsData/make/" + this.value
    }).then(function (data) {
        $.each(data, function (key, value) {
            $('#model')
                .empty()
                .append($('<option>', {value: value.name})
                    .text(value.name));
        });
        $('#model').prop("disabled", false);
    });
});

$('#profitMargin').on('change', function () {
    var price = $('#pricePerElement').val();
    var margin = this.value;

    recalulatePriceWithMargin(price, margin);
});

$('#pricePerElement').on('change', function () {
    var price = this.value;
    var margin = $('#profitMargin').val();

    recalulatePriceWithMargin(price, margin);
});

function recalulatePriceWithMargin(basePrice, profitMargin) {
    var priceWithMarginField = $('#priceWithProfitMargin');

    if (basePrice && profitMargin) {
        var priceMargin = (profitMargin / 100) * basePrice;
        var priceWithMargin = (parseFloat(priceMargin) + parseFloat(basePrice)).toFixed(2);

        priceWithMarginField.val(priceWithMargin);
    }
}