import './ArticleAdd.css';

const ArticleAdd = () => 
    (<>
        <div className="container">
            <form>
                <div className="row">
                <div className="col-25">
                    <label for="fname">First Name</label>
                </div>
                <div className="col-75">
                    <input type="text" id="fname" name="firstname" placeholder="Your name.."/>
                </div>
                </div>
                <div className="row">
                <div className="col-25">
                    <label for="lname">Last Name</label>
                </div>
                <div className="col-75">
                    <input type="text" id="lname" name="lastname" placeholder="Your last name.."/>
                </div>
                </div>
                <div className="row">
                <div className="col-25">
                    <label for="country">Category</label>
                </div>
                <div className="col-75">
                    <select id="country" name="country">
                    <option value="australia">Australia</option>
                    <option value="canada">Canada</option>
                    <option value="usa">USA</option>
                    </select>
                </div>
                </div>
                <div className="row">
                <div className="col-25">
                    <label for="subject">Subject</label>
                </div>
                <div className="col-75">
                    <textarea id="subject" name="subject" placeholder="Write something.." style={{height:"200px"}}></textarea>
                </div>
                </div>
                <div className="row">
                <input type="submit" value="Submit"/>
                </div>
            </form>
        </div>
    </>)

export default ArticleAdd