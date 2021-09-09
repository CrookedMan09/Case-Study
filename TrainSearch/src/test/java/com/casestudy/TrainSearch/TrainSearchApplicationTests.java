package com.casestudy.TrainSearch;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class TrainSearchApplicationTests {

//	@Autowired
//	private TrainServiceImpl service;
//
//	@MockBean
//	private TrainRepository repository;
//
//	@Test
//	public void findTrainByTrainNumberTest() {
//		String trainnumber = "02502";
//		Optional<Trains> trains = Optional.of(new Trains());
//		when(repository.findTrainByTrainNumber(trainnumber)).thenReturn(trains);
//		assertEquals(trains, service.findTrainByTrainNumber(trainnumber));
//	}
//
//	@Test
//	public void findTrainByTrainNameTest() {
//		String trainname = "NDLS AGTL SPL";
//		Optional<Trains> trains = Optional.of(new Trains());
//		when(repository.findTrainByTrainName(trainname)).thenReturn(trains);
//		assertEquals(trains, service.findTrainByTrainName(trainname));
//	}
}
