package com.example.Arbetsprov.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.Arbetsprov.Services.BusService;

@Controller
public class WebController {

    @GetMapping("/busStops")
    @ModelAttribute
    public String busStops(Model model) {

      BusService busService = new BusService();

      var busStops = busService.GetBusStopsWithTheMostStops();

      model.addAttribute("busStops", busStops);

      return "busStops";
    }
}
