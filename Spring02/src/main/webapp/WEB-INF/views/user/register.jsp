<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>ex02</title>
        
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="stylesheet" 
        	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" />
        <style>
        .valid {
            color: green;
            display: none;
        }
        .invalid {
            color: red;
            display: none;
        }
        </style>
    </head>
    <body>
        <div class="container-fluid">
            <header class="text-center">
                <h1>회원 가입 페이지</h1>
            </header>
            
            <nav> <!-- TODO: 페이지 이동 메뉴 -->
            </nav>
            
            <div>
                <form action="./register" method="post">
                    <div>
                        <input type="text" id="userid" name="userid" placeholder="아이디 입력" required />
                        <div class="valid">멋진 아이디입니다!</div>
                        <div class="invalid">이미 사용중인 아이디입니다.</div>
                    </div>
                    <div>
                        <input type="password" name="pwd" placeholder="비밀번호 입력" required />
                    </div>
                    <div>
                        <input type="email" name="email" placeholder="abc@abc.com" required />
                    </div>
                    <div>
                        <input type="submit" id="btn-complete" value="작성 완료" />
                    </div>
                </form>
            </div>
        
        </div>
        
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>