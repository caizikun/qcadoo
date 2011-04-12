package com.qcadoo.view.api.crud;

import java.util.Locale;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.web.servlet.ModelAndView;

/**
 * Service for accessing high-level controller functions. It should be used when creating Spring MVC Controller and want to extend
 * qcadoo framework standard mechanisms.
 * <p>
 * Some example of how CrudService can be used (inside Spring MVC Controller): <blockquote>
 * 
 * <pre>
 * 
 * &#064;RequestMapping(value = &quot;examplePluginPages/infoPage&quot;, method = RequestMethod.GET)
 * public ModelAndView getInfoPageView(@RequestParam final Map&lt;String, String&gt; arguments, final Locale locale) {
 *     arguments.put(&quot;popup&quot;, &quot;true&quot;);
 *     ModelAndView mav = crudService.prepareView(&quot;examplePlugin&quot;, &quot;exampleView&quot;, arguments, locale);
 * 
 *     // some ModelAndView modifications, like:
 *     mav.addObject(&quot;headerClass&quot;, &quot;successHeader&quot;);
 * 
 *     return mav;
 * }
 * 
 * </pre>
 * 
 * </blockquote>
 * 
 * <p>
 * 
 */
public interface CrudService {

    /**
     * Generates Spring ModelAndView for view. Map: - context - popup
     * 
     * @param pluginIdentifier
     *            identifier of plugin
     * @param viewName
     *            name of view
     * @param arguments
     *            map of arguments
     * @param locale
     *            current locale
     * @return generated ModelAndView
     */
    ModelAndView prepareView(String pluginIdentifier, String viewName, Map<String, String> arguments, Locale locale);

    /**
     * 
     * @param pluginIdentifier
     * @param viewName
     * @param body
     * @param locale
     * @return JSONObject
     */
    Object performEvent(String pluginIdentifier, String viewName, JSONObject body, Locale locale);
}
