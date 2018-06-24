package br.com.wsilva.mobileos.controller;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

public interface IGenericController<T> {
	T obterPorId(@PathVariable(value = "id") Integer id);
	List<T> listar();
	T inserir(@RequestParam(value = "entity") T entity);
	boolean atualizar(@RequestParam(value = "entity") T entity);
	boolean excluir(@PathVariable(value = "id") Integer id);
}
