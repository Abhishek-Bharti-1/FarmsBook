package com.farmsbook.farmsbook.buyer.ui.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.farmsbook.farmsbook.databinding.ActivityViewProfileBinding
import com.farmsbook.farmsbook.buyer.ui.suppliers.adapters.SuppliersCropAdapter
import com.farmsbook.farmsbook.buyer.ui.suppliers.adapters.SuppliersCropData

class ViewProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityViewProfileBinding
    private lateinit var plantList: ArrayList<SuppliersCropData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityViewProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
        binding.backBtn.setOnClickListener {
            finish()
        }
        plantList = arrayListOf<SuppliersCropData>()

        binding.suppliersCropsRV.layoutManager = GridLayoutManager(this, 2)
        val adapter = SuppliersCropAdapter(plantList, this)
        binding.suppliersCropsRV.adapter = adapter
        binding.suppliersCropsRV.setNestedScrollingEnabled(false);
        adapter.setOnItemClickListener(object : SuppliersCropAdapter.onItemClickListener {
            override fun onItemClick(position: Int) {

                Toast.makeText(
                    this@ViewProfileActivity,
                    "You Clicked on item no. $position",
                    Toast.LENGTH_SHORT
                ).show()

//                val intent = Intent(this@MainActivity,CropDetailsActivity::class.java)
//                intent.putExtra("Name",plantList[position].Name)
//                intent.putExtra("Location",plantList[position].Location)
//                intent.putExtra("Farmer Name",plantList[position].FarmerName)
//                intent.putExtra("Availability",plantList[position].Availability)
//                intent.putExtra("PricePerKg",plantList[position].PricePerKg)
//                intent.putExtra("Quality",plantList[position].Quality)
//                startActivity(intent)
            }
        })

    }
}