package ie.setu.donationx.data.api

import ie.setu.donationx.data.DonationModel

class DonationWrapper {
    var message: String? = null
    var data: DonationModel? = null
}
class ServiceEndPoints {
    companion object {
        const val BASE_URL= "https://donationxweb-single-server.onrender.com/"
        const val DONATIONS_ENDPOINT = "donations"
    }
}
