package com.amit.pharma.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.amit.pharma.model.ProductDocument;
import com.amit.pharma.repository.ProductMongoRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping("/test")
public class TestController {
	
	private List<Greeting> greetings = new ArrayList<Greeting>();
	
	@Autowired
	ProductMongoRepository productMongoRepository;

//	@GetMapping(value = "/home")
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home() {
		
		return "home";
	}
	
	@RequestMapping(value = "/get/{abc}", method = RequestMethod.GET)
	@ResponseBody
	public String getValues() {
		
//		return "[{\"title\": \"10\"}]";
//		return "{ \"total_count\": 37261, \"incomplete_results\": false, \"items\": [ { \"id\": 89913655, \"node_id\": \"MDEwOlJlcG9zaXRvcnk4OTkxMzY1NQ==\", \"name\": \"bitcoin-abc\", \"full_name\": \"Bitcoin-ABC/bitcoin-abc\", \"private\": false, \"owner\": { \"login\": \"Bitcoin-ABC\", \"id\": 28255313, \"node_id\": \"MDEyOk9yZ2FuaXphdGlvbjI4MjU1MzEz\", \"avatar_url\": \"https://avatars0.githubusercontent.com/u/28255313?v=4\", \"gravatar_id\": \"\", \"url\": \"https://api.github.com/users/Bitcoin-ABC\", \"html_url\": \"https://github.com/Bitcoin-ABC\", \"followers_url\": \"https://api.github.com/users/Bitcoin-ABC/followers\", \"following_url\": \"https://api.github.com/users/Bitcoin-ABC/following{/other_user}\", \"gists_url\": \"https://api.github.com/users/Bitcoin-ABC/gists{/gist_id}\", \"starred_url\": \"https://api.github.com/users/Bitcoin-ABC/starred{/owner}{/repo}\", \"subscriptions_url\": \"https://api.github.com/users/Bitcoin-ABC/subscriptions\", \"organizations_url\": \"https://api.github.com/users/Bitcoin-ABC/orgs\", \"repos_url\": \"https://api.github.com/users/Bitcoin-ABC/repos\", \"events_url\": \"https://api.github.com/users/Bitcoin-ABC/events{/privacy}\", \"received_events_url\": \"https://api.github.com/users/Bitcoin-ABC/received_events\", \"type\": \"Organization\", \"site_admin\": false }, \"html_url\": \"https://github.com/Bitcoin-ABC/bitcoin-abc\", \"description\": \"This a mirror of the official Bitcoin-ABC repository.  Please see README.md\", \"fork\": false, \"url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc\", \"forks_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/forks\", \"keys_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/keys{/key_id}\", \"collaborators_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/collaborators{/collaborator}\", \"teams_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/teams\", \"hooks_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/hooks\", \"issue_events_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/issues/events{/number}\", \"events_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/events\", \"assignees_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/assignees{/user}\", \"branches_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/branches{/branch}\", \"tags_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/tags\", \"blobs_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/git/blobs{/sha}\", \"git_tags_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/git/tags{/sha}\", \"git_refs_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/git/refs{/sha}\", \"trees_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/git/trees{/sha}\", \"statuses_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/statuses/{sha}\", \"languages_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/languages\", \"stargazers_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/stargazers\", \"contributors_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/contributors\", \"subscribers_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/subscribers\", \"subscription_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/subscription\", \"commits_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/commits{/sha}\", \"git_commits_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/git/commits{/sha}\", \"comments_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/comments{/number}\", \"issue_comment_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/issues/comments{/number}\", \"contents_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/contents/{+path}\", \"compare_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/compare/{base}...{head}\", \"merges_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/merges\", \"archive_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/{archive_format}{/ref}\", \"downloads_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/downloads\", \"issues_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/issues{/number}\", \"pulls_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/pulls{/number}\", \"milestones_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/milestones{/number}\", \"notifications_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/notifications{?since,all,participating}\", \"labels_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/labels{/name}\", \"releases_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/releases{/id}\", \"deployments_url\": \"https://api.github.com/repos/Bitcoin-ABC/bitcoin-abc/deployments\", \"created_at\": \"2017-05-01T09:58:15Z\", \"updated_at\": \"2020-05-18T15:35:09Z\", \"pushed_at\": \"2020-05-18T15:35:07Z\", \"git_url\": \"git://github.com/Bitcoin-ABC/bitcoin-abc.git\", \"ssh_url\": \"git@github.com:Bitcoin-ABC/bitcoin-abc.git\", \"clone_url\": \"https://github.com/Bitcoin-ABC/bitcoin-abc.git\", \"svn_url\": \"https://github.com/Bitcoin-ABC/bitcoin-abc\", \"homepage\": \"https://reviews.bitcoinabc.org\", \"size\": 87690, \"stargazers_count\": 904, \"watchers_count\": 904, \"language\": \"C++\", \"has_issues\": true, \"has_projects\": false, \"has_downloads\": true, \"has_wiki\": false, \"has_pages\": false, \"forks_count\": 573, \"mirror_url\": null, \"archived\": false, \"disabled\": false, \"open_issues_count\": 66, \"license\": { \"key\": \"mit\", \"name\": \"MIT License\", \"spdx_id\": \"MIT\", \"url\": \"https://api.github.com/licenses/mit\", \"node_id\": \"MDc6TGljZW5zZTEz\" }, \"forks\": 573, \"open_issues\": 66, \"watchers\": 904, \"default_branch\": \"master\", \"score\": 1 } ] }";
		return "{ \"total_count\": 37261, \"incomplete_results\": false, \"items\": [{ \"id\": 89913655, \"node_id\": \"MDEwOlJlcG9zaXRvcnk4OTkxMzY1NQ==\", \"name\": \"bitcoin-abc\", \"full_name\": \"Bitcoin-ABC/bitcoin-abc\", \"private\": false, \"html_url\": \"https://github.com/Bitcoin-ABC/bitcoin-abc\", \"description\": \"This a mirror of the official Bitcoin-ABC repository.  Please see README.md\", \"fork\": false, \"html_url\": \"https://github.com/Bitcoin-ABC\" } ] }";
	}
	
	
	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public String productInfo() {
		
		return "product-info";
	}
	
	@RequestMapping(value = "/bill", method = RequestMethod.GET)
	public String billing() {
		
		return "bill";
	}
	
	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
	public String getGreeting(@ModelAttribute Greeting greeting, BindingResult errors, Model model) {
//		greetings.clear();
		
//		model.addAttribute("greeting", new Greeting());
		model.addAttribute("greetings", greetings);
		
		System.out.println("greeting get");
		return "bill";
	}
	
	@RequestMapping(value = "/delgreeting/{index}", method = RequestMethod.POST)
	public String delGreeting(@ModelAttribute Greeting greeting, BindingResult errors, Model model, @PathVariable int index) {
//		greetings.clear();
//		model.addAttribute("greeting", new Greeting());
//		greetings.remove(greetings.indexOf(greeting));
		System.out.println("name :: " + greeting.getName());
		System.out.println("Size before: " + greetings.size());
//		greetings.remove(greeting);
		greetings.remove(index-1);
		System.out.println("Size after: " + greetings.size());
		
		System.out.println("greeting deletion");
//		return "bill";
		return "redirect:/test/greeting";
	}
	
	@RequestMapping(value = "/clear", method = RequestMethod.POST)
	public String clear(@ModelAttribute Greeting greeting, BindingResult errors, Model model) {

		System.out.println("Size before: " + greetings.size());
		greetings.clear();
		System.out.println("Size after: " + greetings.size());
		
		System.out.println("greeting clear");

		return "redirect:/test/greeting";
	}
	
	@RequestMapping(value = "/savebill", method = RequestMethod.GET)
	public String saveBill() {
		
//		billRepository.save(bill);
		
		return "save-bill";
	}
	
	@RequestMapping(value = "/postgreeting", method = RequestMethod.POST)
	public String greeting(@ModelAttribute Greeting greeting, BindingResult errors, Model model, @ModelAttribute String del) {
		System.out.println("greeting post");
		
//		List<Greeting> greetings = new ArrayList<Greeting>();
//		model.addAttribute("greetings", greetings);
		
		greetings.add(greeting);
		
//		return "bill";
		return "redirect:/test/greeting";
	}
	
	
	
	//mongodb product collection test
	
	@RequestMapping(value = "/saveprod", method = RequestMethod.GET)
	@ResponseBody
	public ProductDocument saveProduct() {

		ProductDocument product = new ProductDocument();
		product.setId(1).setName("Test product").setMrp(123.21).setManufacturer("Test Company");
		
		productMongoRepository.save(product);
		
		return product;
	}
	@RequestMapping(value = "/getprod/{id}", method = RequestMethod.GET)
	@ResponseBody
	public String getProduct(@PathVariable int id) throws JsonProcessingException {

		System.out.println("id: " + id);
		ProductDocument product = productMongoRepository.findById(id).get();
		
		ObjectMapper mapper = new ObjectMapper();
		
		//Convert object to JSON string
		String jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(product);
		return jsonInString;
	}
	
}
