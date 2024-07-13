import { Routes } from '@angular/router';
import { MovieListComponent } from './components/movie-list/movie-list.component';
import { SearchComponent } from './components/search/search.component';
import { MovieDetailComponent } from './components/movie-detail/movie-detail.component';

export const routes: Routes = [
    {path: '', redirectTo: '/search', pathMatch:'full'},
    {path: 'search', component: SearchComponent},
    {path: 'movies', component: MovieListComponent},
    {path: 'movie/:id', component: MovieDetailComponent},
];
