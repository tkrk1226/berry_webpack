/src : 
    <br/>
    1. assets : img, scss
    <br/>
    2. hooks : useScriptRef
    <br/>
    3. layout : 화면에서 쓰이는 레이아웃들 (header, navBar)
    <br/>
    4. menu-items : index.js에 json 형태로 각 페이지별 url에 대해 정의
    <br/>
    5. routes : App.js에 쓰이는 router들을 선언
    <br/>
    6. store : redux에 쓰이는 action 및 css 상태들의 값 공유를 위함
    <br/>
    7. theme : 디자인 탬플릿에 쓰이는 값
    <br/>
    8. ui-component : ui에 쓰이는 component 요소들 (contents 내의 정보들을 감싸는)을 담기위한 기능 및 보관소
    <br/>
    9. views : routes에 정의한 페이지들을 정의한 페이지, 실제로 보여지는 view
    <br/><br/>
    App : BrowseRouter에 들어가는 contents들 정의
    <br/>
    config : url 및 기본 글꼴
    <br/>
    index : index.html에 참조됨
    <br/><br/>

 .eslintrc : 페이지 파싱을 위한 설정들, webpack.config에 들어갈 예정...
    <br/>
 jsconfig.json : 없으면 react-scripts에서 문제가 생김, webpack에도 필요한지 검증해야함