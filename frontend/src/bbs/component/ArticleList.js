import './ArticleList.css';
import App from '../../App';

const ArticleList = () =>
    (<>
        <App/>
        <h1>Borad List</h1>
        <table>
        <thead>
            <tr>
                <td>No</td>
                <td>Title</td>
                <td>Name</td>
                <td>Date</td>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
        </tbody>
        </table>
    
        <div className="pagination">
        <a href="#">&laquo;</a>
        <a href="#">1</a>
        <a className="active" href="#">2</a>
        <a href="#">3</a>
        <a href="#">4</a>
        <a href="#">5</a>
        <a href="#">6</a>
        <a href="#">&raquo;</a>
        </div>
    </>)

export default ArticleList