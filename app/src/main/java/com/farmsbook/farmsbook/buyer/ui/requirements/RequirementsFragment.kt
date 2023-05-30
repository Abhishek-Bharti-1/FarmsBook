package com.farmsbook.farmsbook.buyer.ui.requirements

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.farmsbook.farmsbook.databinding.FragmentRequirementsBinding
import com.farmsbook.farmsbook.buyer.ui.requirements.fragments.OffersFragment
import com.farmsbook.farmsbook.buyer.ui.requirements.fragments.requirements_child.RequirementsChildFragment
import com.farmsbook.farmsbook.buyer.utility.VPAdapter

class RequirementsFragment : Fragment() {

    private var _binding: FragmentRequirementsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(RequirementsViewModel::class.java)

        _binding = FragmentRequirementsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val tabLayout = binding.tabLayout
        val viewpager = binding.Viewpager

        tabLayout?.setupWithViewPager(viewpager)

        val vpAdapter= VPAdapter(childFragmentManager)
        vpAdapter.addFragment(RequirementsChildFragment(),"Requirements")
        vpAdapter.addFragment(OffersFragment(),"Offers")
        viewpager.adapter = vpAdapter
        viewpager.setSwipePagingEnabled(true)


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}