![CI](https://github.com/teverett/quadrigacx-api/workflows/CI/badge.svg)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/6a0e9f8f626847319964d1a102382b12)](https://www.codacy.com/app/teverett/quadrigacx-api?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=teverett/quadrigacx-api&amp;utm_campaign=Badge_Grade)

# quadrigacx-api
A Java API for [quadrigacx.com](https://www.quadrigacx.com/) based on the [v2 API](https://www.quadrigacx.com/api_info)

## License

quadrigacx-api is distributed under the [GPL v3](https://www.gnu.org/licenses/gpl-3.0.en.html).

## Requirements

To use quadrigacx-api you must have:

* quadrigacx-api client id
* quadrigacx-api api key
* quadrigacx-api api secret

Instructions for creating an API key are [here](https://www.quadrigacx.com/api_info).

## Example

A simple example of getting the current ticker

<pre>
final QuadrigacxAuthData authData = new QuadrigacxAuthData(myKey, mySecret, myClientID);
final Quadrigacx quadrigacx = new Quadrigacx(authData);
final TradingInfoResponse tradingInfo = quadrigacx.getTradingInfo(Quadrigacx.Book.btc_cad);
</pre>




