https://betulsahinn.medium.com/spring-boot-ile-unit-test-yazmak-f1e4fc1f3df

Test kapsamı (test coverage), yazılmış olan kodun ne kadarının test edildiğini ölçen bir metriktir. Bu metrik, genellikle kodun yüzde olarak ifade edilen bir kısmını kapsayan bir değeri gösterir. Test kapsamı, genellikle "test edilen kod satırlarının toplam kod satırlarına oranı" şeklinde ifade edilir.

Test kapsamının hesaplanması, yazılan testlerin çalıştırılması sırasında hangi kodun kaç kez veya hangi koşullarda yürütüldüğünü izleyen bir araç tarafından gerçekleştirilir. Bu izleme sırasında her bir kod satırı için aşağıdaki durumlar kaydedilir:

    İlgili Kod Satırı Test Edilmişse (Covered): Bu durumda, test kapsamı artar. Testler tarafından en az bir kez çalıştırılmış olan kod satırları "covered" (kaplanmış) olarak adlandırılır.

    İlgili Kod Satırı Test Edilmemişse (Not Covered): Bu durumda, test kapsamı artmaz. Kod satırı, hiçbir test tarafından çalıştırılmamışsa "not covered" (kaplanmamış) olarak adlandırılır.

Test kapsamı, genellikle şu şekilde ifade edilir:

Test Coverage %=(Covered LinesTotal Lines)×100Test Coverage %=(Total LinesCovered Lines)×100

Bu metrik, yazılan testlerin kodun ne kadarını kontrol ettiğini ve potansiyel hataları ne kadarını tespit edebileceğini ölçmeye yardımcı olur. Ancak, test kapsamı yüksek olabilirken, yazılan testlerin kalitesiz olması veya belirli senaryoları kapsamaması gibi durumlar da göz ardı edilmemelidir.

Test kapsamı, özellikle büyük projelerde ve endüstri standartlarında, yazılım kalitesi ve güvenilirliği üzerinde bir gösterge olarak kullanılır. Yüksek test kapsamına sahip bir proje, daha güvenilir ve bakımı daha kolay bir kod tabanına sahip olma eğilimindedir. Ancak, test kapsamı tek başına yeterli bir yazılım kalitesi göstergesi değildir; testlerin kalitesi ve test senaryolarının uygunluğu da önemli faktörlerdir.