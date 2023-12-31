import { Link } from "react-router-dom"

interface SidebarItemProps {
    icon?: any
    text: string
    active: boolean
    link: string
}

const SidebarItem = (props: SidebarItemProps)  => {

    return (
        <Link to={props.link}>
            <li className={`relative flex items-center py-2 my-1 font-medium cursor-pointer
            transition-colors ${props.active ? "bg-gradient-to-tr from-gray-600 to-gray-700 text-gray-100" :
                "hover:bg-gray-700 text-gray-500"}`}>
                {props.icon && props.icon}
                <span className="w-52 ml-3">{props.text}</span>
            </li>
        </Link>
    )
}


export { SidebarItem }