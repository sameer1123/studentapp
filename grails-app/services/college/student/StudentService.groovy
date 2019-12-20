package college.student

import grails.gorm.transactions.Transactional

@Transactional
Class StudentService {

    def get(Serializable id)
    {
        return Student.get(id)
    }

    def list(Map args)
    {
        return Student.list(args)
    }

    def count()
    {
        return Student.count()
    }

    def delete(Serializable id)
    {
        Student.get(id).delete()
    }

    def save(Student)
    {
        return Student.save()
    }

}
