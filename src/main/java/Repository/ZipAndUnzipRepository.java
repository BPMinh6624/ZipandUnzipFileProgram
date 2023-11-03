/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataAccess.ZipAndUnzipDAO;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tuanh
 */
public class ZipAndUnzipRepository implements IZipAndUnzipRepository {

    @Override
    public void zipFile() {
        try {
            ZipAndUnzipDAO.Instance().zipFile();
        } catch (IOException ex) {
            Logger.getLogger(ZipAndUnzipRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void unzipFile() {
        try {
            ZipAndUnzipDAO.Instance().unzipFile();
        } catch (IOException ex) {
            Logger.getLogger(ZipAndUnzipRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
