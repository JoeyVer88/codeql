package generatedtest;

import java.util.Collection;
import java.util.Map;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

// Test case generated by GenerateFlowTestCase.ql
public class Test {

	Object getMapKey(Object container) { return null; }
	Object getMapValue(Object container) { return null; }
	Object newWithElement(Object element) { return null; }
	Object newWithMapKey(Object element) { return null; }
	Object newWithMapValue(Object element) { return null; }
	Object source() { return null; }
	void sink(Object o) { }

	public void test() {

		{
			// "org.springframework.ui;ConcurrentModel;false;ConcurrentModel;(Object);;Argument[0];MapValue of Argument[-1];value"
			ConcurrentModel out = null;
			Object in = source();
			out = new ConcurrentModel(in);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;ConcurrentModel;false;ConcurrentModel;(String,Object);;Argument[0];MapKey of Argument[-1];value"
			ConcurrentModel out = null;
			String in = (String)source();
			out = new ConcurrentModel(in, null);
			sink(getMapKey(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;ConcurrentModel;false;ConcurrentModel;(String,Object);;Argument[1];MapValue of Argument[-1];value"
			ConcurrentModel out = null;
			Object in = source();
			out = new ConcurrentModel(null, in);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;addAllAttributes;(Collection);;Element of Argument[0];MapValue of Argument[-1];value"
			Model out = null;
			Collection in = (Collection)newWithElement(source());
			out.addAllAttributes(in);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;addAllAttributes;(Collection);;Element of Argument[0];MapValue of Argument[-1];value"
			ConcurrentModel out = null;
			Collection in = (Collection)newWithElement(source());
			out.addAllAttributes(in);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;addAllAttributes;(Collection);;Element of Argument[0];MapValue of ReturnValue;value"
			Model out = null;
			Collection in = (Collection)newWithElement(source());
			Model instance = null;
			out = instance.addAllAttributes(in);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;addAllAttributes;(Collection);;Element of Argument[0];MapValue of ReturnValue;value"
			ConcurrentModel out = null;
			Collection in = (Collection)newWithElement(source());
			ConcurrentModel instance = null;
			out = instance.addAllAttributes(in);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;addAllAttributes;(Map);;MapKey of Argument[0];MapKey of Argument[-1];value"
			Model out = null;
			Map in = (Map)newWithMapKey(source());
			out.addAllAttributes(in);
			sink(getMapKey(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;addAllAttributes;(Map);;MapKey of Argument[0];MapKey of Argument[-1];value"
			ConcurrentModel out = null;
			Map in = (Map)newWithMapKey(source());
			out.addAllAttributes(in);
			sink(getMapKey(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;addAllAttributes;(Map);;MapKey of Argument[0];MapKey of ReturnValue;value"
			Model out = null;
			Map in = (Map)newWithMapKey(source());
			Model instance = null;
			out = instance.addAllAttributes(in);
			sink(getMapKey(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;addAllAttributes;(Map);;MapKey of Argument[0];MapKey of ReturnValue;value"
			ConcurrentModel out = null;
			Map in = (Map)newWithMapKey(source());
			ConcurrentModel instance = null;
			out = instance.addAllAttributes(in);
			sink(getMapKey(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;addAllAttributes;(Map);;MapValue of Argument[0];MapValue of Argument[-1];value"
			Model out = null;
			Map in = (Map)newWithMapValue(source());
			out.addAllAttributes(in);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;addAllAttributes;(Map);;MapValue of Argument[0];MapValue of Argument[-1];value"
			ConcurrentModel out = null;
			Map in = (Map)newWithMapValue(source());
			out.addAllAttributes(in);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;addAllAttributes;(Map);;MapValue of Argument[0];MapValue of ReturnValue;value"
			Model out = null;
			Map in = (Map)newWithMapValue(source());
			Model instance = null;
			out = instance.addAllAttributes(in);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;addAllAttributes;(Map);;MapValue of Argument[0];MapValue of ReturnValue;value"
			ConcurrentModel out = null;
			Map in = (Map)newWithMapValue(source());
			ConcurrentModel instance = null;
			out = instance.addAllAttributes(in);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;addAllAttributes;;;Argument[-1];ReturnValue;value"
			Model out = null;
			Model in = (Model)source();
			out = in.addAllAttributes((Map)null);
			sink(out); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;addAllAttributes;;;Argument[-1];ReturnValue;value"
			Model out = null;
			Model in = (Model)source();
			out = in.addAllAttributes((Collection)null);
			sink(out); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;addAllAttributes;;;Argument[-1];ReturnValue;value"
			ConcurrentModel out = null;
			ConcurrentModel in = (ConcurrentModel)source();
			out = in.addAllAttributes((Map)null);
			sink(out); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;addAllAttributes;;;Argument[-1];ReturnValue;value"
			ConcurrentModel out = null;
			ConcurrentModel in = (ConcurrentModel)source();
			out = in.addAllAttributes((Collection)null);
			sink(out); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;addAttribute;(Object);;Argument[0];MapValue of Argument[-1];value"
			Model out = null;
			Object in = source();
			out.addAttribute(in);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;addAttribute;(Object);;Argument[0];MapValue of Argument[-1];value"
			ConcurrentModel out = null;
			Object in = source();
			out.addAttribute(in);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;addAttribute;(Object);;Argument[0];MapValue of ReturnValue;value"
			Model out = null;
			Object in = source();
			Model instance = null;
			out = instance.addAttribute(in);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;addAttribute;(Object);;Argument[0];MapValue of ReturnValue;value"
			ConcurrentModel out = null;
			Object in = source();
			ConcurrentModel instance = null;
			out = instance.addAttribute(in);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;addAttribute;(String,Object);;Argument[0];MapKey of Argument[-1];value"
			Model out = null;
			String in = (String)source();
			out.addAttribute(in, null);
			sink(getMapKey(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;addAttribute;(String,Object);;Argument[0];MapKey of Argument[-1];value"
			ConcurrentModel out = null;
			String in = (String)source();
			out.addAttribute(in, null);
			sink(getMapKey(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;addAttribute;(String,Object);;Argument[0];MapKey of ReturnValue;value"
			Model out = null;
			String in = (String)source();
			Model instance = null;
			out = instance.addAttribute(in, null);
			sink(getMapKey(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;addAttribute;(String,Object);;Argument[0];MapKey of ReturnValue;value"
			ConcurrentModel out = null;
			String in = (String)source();
			ConcurrentModel instance = null;
			out = instance.addAttribute(in, null);
			sink(getMapKey(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;addAttribute;(String,Object);;Argument[1];MapValue of Argument[-1];value"
			Model out = null;
			Object in = source();
			out.addAttribute(null, in);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;addAttribute;(String,Object);;Argument[1];MapValue of Argument[-1];value"
			ConcurrentModel out = null;
			Object in = source();
			out.addAttribute(null, in);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;addAttribute;(String,Object);;Argument[1];MapValue of ReturnValue;value"
			Model out = null;
			Object in = source();
			Model instance = null;
			out = instance.addAttribute(null, in);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;addAttribute;(String,Object);;Argument[1];MapValue of ReturnValue;value"
			ConcurrentModel out = null;
			Object in = source();
			ConcurrentModel instance = null;
			out = instance.addAttribute(null, in);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;addAttribute;;;Argument[-1];ReturnValue;value"
			Model out = null;
			Model in = (Model)source();
			out = in.addAttribute(null, null);
			sink(out); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;addAttribute;;;Argument[-1];ReturnValue;value"
			Model out = null;
			Model in = (Model)source();
			out = in.addAttribute(null);
			sink(out); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;addAttribute;;;Argument[-1];ReturnValue;value"
			ConcurrentModel out = null;
			ConcurrentModel in = (ConcurrentModel)source();
			out = in.addAttribute(null, null);
			sink(out); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;addAttribute;;;Argument[-1];ReturnValue;value"
			ConcurrentModel out = null;
			ConcurrentModel in = (ConcurrentModel)source();
			out = in.addAttribute(null);
			sink(out); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;asMap;;;MapKey of Argument[-1];MapKey of ReturnValue;value"
			Map out = null;
			Model in = (Model)newWithMapKey(source());
			out = in.asMap();
			sink(getMapKey(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;asMap;;;MapKey of Argument[-1];MapKey of ReturnValue;value"
			Map out = null;
			ConcurrentModel in = (ConcurrentModel)newWithMapKey(source());
			out = in.asMap();
			sink(getMapKey(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;asMap;;;MapValue of Argument[-1];MapValue of ReturnValue;value"
			Map out = null;
			Model in = (Model)newWithMapValue(source());
			out = in.asMap();
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;asMap;;;MapValue of Argument[-1];MapValue of ReturnValue;value"
			Map out = null;
			ConcurrentModel in = (ConcurrentModel)newWithMapValue(source());
			out = in.asMap();
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;getAttribute;;;MapValue of Argument[-1];ReturnValue;value"
			Object out = null;
			Model in = (Model)newWithMapValue(source());
			out = in.getAttribute(null);
			sink(out); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;getAttribute;;;MapValue of Argument[-1];ReturnValue;value"
			Object out = null;
			ConcurrentModel in = (ConcurrentModel)newWithMapValue(source());
			out = in.getAttribute(null);
			sink(out); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;mergeAttributes;;;Argument[-1];ReturnValue;value"
			Model out = null;
			Model in = (Model)source();
			out = in.mergeAttributes(null);
			sink(out); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;mergeAttributes;;;Argument[-1];ReturnValue;value"
			ConcurrentModel out = null;
			ConcurrentModel in = (ConcurrentModel)source();
			out = in.mergeAttributes(null);
			sink(out); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;mergeAttributes;;;MapKey of Argument[-1];MapValue of ReturnValue;value"
			Model out = null;
			Model in = (Model)newWithMapKey(source());
			out = in.mergeAttributes(null);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;mergeAttributes;;;MapKey of Argument[-1];MapValue of ReturnValue;value"
			ConcurrentModel out = null;
			ConcurrentModel in = (ConcurrentModel)newWithMapKey(source());
			out = in.mergeAttributes(null);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;mergeAttributes;;;MapKey of Argument[0];MapKey of Argument[-1];value"
			Model out = null;
			Map in = (Map)newWithMapKey(source());
			out.mergeAttributes(in);
			sink(getMapKey(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;mergeAttributes;;;MapKey of Argument[0];MapKey of Argument[-1];value"
			ConcurrentModel out = null;
			Map in = (Map)newWithMapKey(source());
			out.mergeAttributes(in);
			sink(getMapKey(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;mergeAttributes;;;MapValue of Argument[-1];MapValue of ReturnValue;value"
			Model out = null;
			Model in = (Model)newWithMapValue(source());
			out = in.mergeAttributes(null);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;mergeAttributes;;;MapValue of Argument[-1];MapValue of ReturnValue;value"
			ConcurrentModel out = null;
			ConcurrentModel in = (ConcurrentModel)newWithMapValue(source());
			out = in.mergeAttributes(null);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;mergeAttributes;;;MapValue of Argument[0];MapValue of Argument[-1];value"
			Model out = null;
			Map in = (Map)newWithMapValue(source());
			out.mergeAttributes(in);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;Model;true;mergeAttributes;;;MapValue of Argument[0];MapValue of Argument[-1];value"
			ConcurrentModel out = null;
			Map in = (Map)newWithMapValue(source());
			out.mergeAttributes(in);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;ModelMap;false;ModelMap;(Object);;Argument[0];MapValue of Argument[-1];value"
			ModelMap out = null;
			Object in = source();
			out = new ModelMap(in);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;ModelMap;false;ModelMap;(String,Object);;Argument[0];MapKey of Argument[-1];value"
			ModelMap out = null;
			String in = (String)source();
			out = new ModelMap(in, null);
			sink(getMapKey(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;ModelMap;false;ModelMap;(String,Object);;Argument[1];MapValue of Argument[-1];value"
			ModelMap out = null;
			Object in = source();
			out = new ModelMap(null, in);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;ModelMap;false;addAllAttributes;(Collection);;Element of Argument[0];MapValue of Argument[-1];value"
			ModelMap out = null;
			Collection in = (Collection)newWithElement(source());
			out.addAllAttributes(in);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;ModelMap;false;addAllAttributes;(Collection);;Element of Argument[0];MapValue of ReturnValue;value"
			ModelMap out = null;
			Collection in = (Collection)newWithElement(source());
			ModelMap instance = null;
			out = instance.addAllAttributes(in);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;ModelMap;false;addAllAttributes;(Map);;MapKey of Argument[0];MapKey of Argument[-1];value"
			ModelMap out = null;
			Map in = (Map)newWithMapKey(source());
			out.addAllAttributes(in);
			sink(getMapKey(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;ModelMap;false;addAllAttributes;(Map);;MapKey of Argument[0];MapKey of ReturnValue;value"
			ModelMap out = null;
			Map in = (Map)newWithMapKey(source());
			ModelMap instance = null;
			out = instance.addAllAttributes(in);
			sink(getMapKey(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;ModelMap;false;addAllAttributes;(Map);;MapValue of Argument[0];MapValue of Argument[-1];value"
			ModelMap out = null;
			Map in = (Map)newWithMapValue(source());
			out.addAllAttributes(in);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;ModelMap;false;addAllAttributes;(Map);;MapValue of Argument[0];MapValue of ReturnValue;value"
			ModelMap out = null;
			Map in = (Map)newWithMapValue(source());
			ModelMap instance = null;
			out = instance.addAllAttributes(in);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;ModelMap;false;addAllAttributes;;;Argument[-1];ReturnValue;value"
			ModelMap out = null;
			ModelMap in = (ModelMap)source();
			out = in.addAllAttributes((Map)null);
			sink(out); // $hasValueFlow
		}
		{
			// "org.springframework.ui;ModelMap;false;addAllAttributes;;;Argument[-1];ReturnValue;value"
			ModelMap out = null;
			ModelMap in = (ModelMap)source();
			out = in.addAllAttributes((Collection)null);
			sink(out); // $hasValueFlow
		}
		{
			// "org.springframework.ui;ModelMap;false;addAttribute;(Object);;Argument[0];MapValue of Argument[-1];value"
			ModelMap out = null;
			Object in = source();
			out.addAttribute(in);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;ModelMap;false;addAttribute;(Object);;Argument[0];MapValue of ReturnValue;value"
			ModelMap out = null;
			Object in = source();
			ModelMap instance = null;
			out = instance.addAttribute(in);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;ModelMap;false;addAttribute;(String,Object);;Argument[0];MapKey of Argument[-1];value"
			ModelMap out = null;
			String in = (String)source();
			out.addAttribute(in, null);
			sink(getMapKey(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;ModelMap;false;addAttribute;(String,Object);;Argument[0];MapKey of ReturnValue;value"
			ModelMap out = null;
			String in = (String)source();
			ModelMap instance = null;
			out = instance.addAttribute(in, null);
			sink(getMapKey(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;ModelMap;false;addAttribute;(String,Object);;Argument[1];MapValue of Argument[-1];value"
			ModelMap out = null;
			Object in = source();
			out.addAttribute(null, in);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;ModelMap;false;addAttribute;(String,Object);;Argument[1];MapValue of ReturnValue;value"
			ModelMap out = null;
			Object in = source();
			ModelMap instance = null;
			out = instance.addAttribute(null, in);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;ModelMap;false;addAttribute;;;Argument[-1];ReturnValue;value"
			ModelMap out = null;
			ModelMap in = (ModelMap)source();
			out = in.addAttribute(null, null);
			sink(out); // $hasValueFlow
		}
		{
			// "org.springframework.ui;ModelMap;false;addAttribute;;;Argument[-1];ReturnValue;value"
			ModelMap out = null;
			ModelMap in = (ModelMap)source();
			out = in.addAttribute(null);
			sink(out); // $hasValueFlow
		}
		{
			// "org.springframework.ui;ModelMap;false;getAttribute;;;MapValue of Argument[-1];ReturnValue;value"
			Object out = null;
			ModelMap in = (ModelMap)newWithMapValue(source());
			out = in.getAttribute(null);
			sink(out); // $hasValueFlow
		}
		{
			// "org.springframework.ui;ModelMap;false;mergeAttributes;;;Argument[-1];ReturnValue;value"
			ModelMap out = null;
			ModelMap in = (ModelMap)source();
			out = in.mergeAttributes(null);
			sink(out); // $hasValueFlow
		}
		{
			// "org.springframework.ui;ModelMap;false;mergeAttributes;;;MapKey of Argument[-1];MapValue of ReturnValue;value"
			ModelMap out = null;
			ModelMap in = (ModelMap)newWithMapKey(source());
			out = in.mergeAttributes(null);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;ModelMap;false;mergeAttributes;;;MapKey of Argument[0];MapKey of Argument[-1];value"
			ModelMap out = null;
			Map in = (Map)newWithMapKey(source());
			out.mergeAttributes(in);
			sink(getMapKey(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;ModelMap;false;mergeAttributes;;;MapValue of Argument[-1];MapValue of ReturnValue;value"
			ModelMap out = null;
			ModelMap in = (ModelMap)newWithMapValue(source());
			out = in.mergeAttributes(null);
			sink(getMapValue(out)); // $hasValueFlow
		}
		{
			// "org.springframework.ui;ModelMap;false;mergeAttributes;;;MapValue of Argument[0];MapValue of Argument[-1];value"
			ModelMap out = null;
			Map in = (Map)newWithMapValue(source());
			out.mergeAttributes(in);
			sink(getMapValue(out)); // $hasValueFlow
		}

	}

}