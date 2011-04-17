package com.github.rnewson.couchdb.lucene.pojo;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ViewRow {

	private Document doc;
	private String id;
	private String key;
	private Object value;

	public Document getDoc() {
		return doc;
	}

	public String getId() {
		return id;
	}

	public String getKey() {
		return key;
	}

	public Object getValue() {
		return value;
	}

	public void setDoc(final Document doc) {
		this.doc = doc;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public void setKey(final String key) {
		this.key = key;
	}

	public void setValue(final Object value) {
		this.value = value;
	}

}
