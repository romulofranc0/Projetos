import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MovieService {

  private apiUrl = '/api/movies';

  constructor(private http: HttpClient) { }

  searchMovies(query: string): Observable<any>{
    return this.http.get(`${this.apiUrl}/search?title=${query}`);
    
  }

  getMovieDetails(imdbId: string): Observable<any>{
    return this.http.get(`${this.apiUrl}/details/${imdbId}`);
  }
}
