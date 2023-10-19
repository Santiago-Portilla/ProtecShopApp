package com.portosdeveloper.protecshopapp.di

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import com.portosdeveloper.protecshopapp.core.Constants.BUTTON
import com.portosdeveloper.protecshopapp.core.Constants.PACKAGE
import com.portosdeveloper.protecshopapp.core.Constants.PACKING
import com.portosdeveloper.protecshopapp.core.Constants.REFLECTIVE
import com.portosdeveloper.protecshopapp.core.Constants.THREAD
import com.portosdeveloper.protecshopapp.core.Constants.USERS
import com.portosdeveloper.protecshopapp.core.Constants.USERSWORKSHOP
import com.portosdeveloper.protecshopapp.core.Constants.UTILS
import com.portosdeveloper.protecshopapp.core.Constants.YARN
import com.portosdeveloper.protecshopapp.data.repository.AuthRepositoryImpl
import com.portosdeveloper.protecshopapp.data.repository.UserWorkShopRepositoryImpl
import com.portosdeveloper.protecshopapp.data.repository.UsersRepositoryImpl
import com.portosdeveloper.protecshopapp.data.repository.UtilsRepositoryImpl
import com.portosdeveloper.protecshopapp.domain.repository.AuthRepository
import com.portosdeveloper.protecshopapp.domain.repository.UserWorkShopRepository
import com.portosdeveloper.protecshopapp.domain.repository.UsersRepository
import com.portosdeveloper.protecshopapp.domain.repository.UtilsRepository
import com.portosdeveloper.protecshopapp.domain.use_cases.auth.*
import com.portosdeveloper.protecshopapp.domain.use_cases.user.*
import com.portosdeveloper.protecshopapp.domain.use_cases.user_work_shop.*
import com.portosdeveloper.protecshopapp.domain.use_cases.utils.GetList
import com.portosdeveloper.protecshopapp.domain.use_cases.utils.UtilsUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    fun provideFirebaseAuth(): FirebaseAuth = FirebaseAuth.getInstance()

    @Provides
    fun providesFireBaseFireStore(): FirebaseFirestore = Firebase.firestore

    @Provides
    fun provideFirebaseStorage(): FirebaseStorage = FirebaseStorage.getInstance()

    @Provides
    @Named(USERS)
    fun providesUsersRef(db : FirebaseFirestore) : CollectionReference = db.collection(USERS)

    @Provides
    @Named(USERSWORKSHOP)
    fun providesUserWorkShopRef(db : FirebaseFirestore) : CollectionReference = db.collection(USERSWORKSHOP)

    @Provides
    @Named(USERS)
    fun provideStorageUsersRef(storage : FirebaseStorage): StorageReference = storage.reference.child(USERS)

    /*
    @Provides
    @Named(CLOTH)
    fun providesClothRef(db : FirebaseFirestore) : CollectionReference = db.collection(CLOTH)

    @Provides
    @Named(TOTALCLOTH)
    fun providesTotalClothRef(db : FirebaseFirestore) : CollectionReference = db.collection(TOTALCLOTH)

    @Provides
    @Named(PLOTTER)
    fun providesPlotterRef(db : FirebaseFirestore) : CollectionReference = db.collection(PLOTTER)

    @Provides
    @Named(WADDING)
    fun providesWaddingRef(db : FirebaseFirestore) : CollectionReference = db.collection(WADDING)

    @Provides
    @Named(ROLLWADDING)
    fun providesRollWaddingRef(db : FirebaseFirestore) : CollectionReference = db.collection(ROLLWADDING)

     */

    @Provides
    @Named(THREAD)
    fun providesThreadRef(db : FirebaseFirestore) : CollectionReference = db.collection(THREAD)

    @Provides
    @Named(YARN)
    fun providesYarnRef(db : FirebaseFirestore) : CollectionReference = db.collection(YARN)

    @Provides
    @Named(REFLECTIVE)
    fun providesReflectiveRef(db : FirebaseFirestore) : CollectionReference = db.collection(REFLECTIVE)

    @Provides
    @Named(BUTTON)
    fun providesButtonRef(db : FirebaseFirestore) : CollectionReference = db.collection(BUTTON)

    @Provides
    @Named(PACKING)
    fun providesPackingRef(db : FirebaseFirestore) : CollectionReference = db.collection(PACKING)

    @Provides
    @Named(UTILS)
    fun providesUtilsRef(db : FirebaseFirestore) : CollectionReference = db.collection(UTILS)

    @Provides
    @Named(PACKAGE)
    fun providesPackageRef(db : FirebaseFirestore) : CollectionReference = db.collection(PACKAGE)

    @Provides
    fun provideAuthRepository(Impl : AuthRepositoryImpl) : AuthRepository = Impl

    @Provides
    fun providesUsersRepository(Impl : UsersRepositoryImpl) : UsersRepository = Impl

    @Provides
    fun providesUsersWorkShopRepository(Impl : UserWorkShopRepositoryImpl) : UserWorkShopRepository = Impl

    /*
    @Provides
    fun providesClothRepository(Impl : ClothRepositoryImpl) : ClothRepository = Impl

    @Provides
    fun providesPlotterRepository(Impl : PlotterRepositoryImpl) : PlotterRepository = Impl

    @Provides
    fun providesWaddingRepository(Impl : WaddingRepositoryImpl) : WaddingRepository = Impl

    @Provides
    fun providesRollWaddingRepository(Impl : RollWaddingRepositoryImpl) : RollWaddingRepository = Impl
     */

    /*
    @Provides
    fun providesThreadRepository(Impl : ThreadRepositoryImpl) : ThreadRepository = Impl

    @Provides
    fun providesYarnRepository(Impl : YarnRepositoryImpl) : YarnRepository = Impl

    @Provides
    fun providesReflectiveRepository(Impl : ReflectiveRepositoryImpl) : ReflectiveRepository = Impl

    @Provides
    fun providesButtonRepository(Impl : ButtonRepositoryImpl) : ButtonRepository = Impl

    @Provides
    fun providesPackingRepository(Impl : PackingRepositoryImpl) : PackingRepository = Impl

    @Provides
    fun providesUtilsRepository(Impl : UtilsRepositoryImpl) : UtilsRepository = Impl

    @Provides
    fun providesPackageRepository(Impl : PackageRepositoryImpl) : PackageRepository = Impl


     */

    @Provides
    fun provideAuthUseCases(repository : AuthRepository) = AuthUseCases(
        login = Login(repository),
        getCurrentUser = GetCurrentUser(repository),
        signUp = SignUp(repository),
        logOut = LogOut(repository)
    )

    @Provides
    fun provideUserUseCases(repository : UsersRepository) = UserUseCases(
        create = Create(repository),
        getUserById = GetUserById(repository),
        update = Update(repository),
        saveImage = SaveImage(repository)
    )

    @Provides
    fun provideUserWorkShopUseCases(repository : UserWorkShopRepository) = UserWorkShopUseCases(
        getCutUserWorkShop = GetCutUserWorkShop(repository),
        getUserWorkShopList = GetUserWorkShopList(repository),
        updateWorkFinishList = UpdateWorkFinishList(repository),
        updateWorkPaidList = UpdateWorkPaidList(repository),
        updateWorkProgressList = UpdateWorkProgressList(repository),
        updateSalaryWorkMonth = UpdateSalaryWorkMonth(repository),
        updateSalaryWorkWeek = UpdateSalaryWorkWeek(repository)
    )


    /*
    @Provides
    fun provideClothUseCases(repository : ClothRepository) = ClothUseCases(
        createCloth = CreateCloth(repository),
        createTotalCloth = CreateTotalCloth(repository),
        getTotalMeasureById = GetTotalMeasureById(repository),
        updateTotalCloth = UpdateTotalCloth(repository),
        stockTotalCloth = StockTotalCloth(repository),
        getClothList = GetClothList(repository),
        updateCloth = UpdateCloth(repository),
        addDateTotalCloth = AddDateTotalCloth(repository)
    )

    @Provides
    fun providePlotterUseCases(repository : PlotterRepository) = PlotterUseCases(
        createPlotter = CreatePlotter(repository),
        getIdPlotter = GetIdPlotter(repository),
        stockPlotter = StockPlotter(repository),
        getPlotterList = GetPlotterList(repository),
        updatePlotter = UpdatePlotter(repository)
    )

    @Provides
    fun provideWaddingUseCases(repository : WaddingRepository) = WaddingUseCases(
        createWadding = CreateWadding(repository),
        updateWadding = UpdateWadding(repository),
        getTotalWadding = GetTotalWadding(repository),
        addDateWadding = AddDateWadding(repository),
        stockWadding = StockWadding(repository)
    )

    @Provides
    fun provideRollWaddingUseCases(repository : RollWaddingRepository) = RollWaddingUseCases(
        createRollWadding = CreateRollWadding(repository),
        updateRollWadding = UpdateRollWadding(repository),
        getTotalRollWadding = GetTotalRollWadding(repository),
        addDateRollWadding = AddDateRollWadding(repository),
        stockRollWadding = StockRollWadding(repository),
        getTotalMetersRollWadding = GetTotalMetersRollWadding(repository)
    )
     */

    /*
    @Provides
    fun provideThreadUseCases(repository : ThreadRepository) = ThreadUseCases(
        createThread = CreateThread(repository),
        updateThread = UpdateThread(repository),
        getTotalThread = GetTotalThread(repository),
        addTotalThreadDay = AddTotalThreadDay(repository),
        stockThread = StockThread(repository)
    )

    @Provides
    fun provideYarnUseCases(repository : YarnRepository) = YarnUseCases(
        createYarn = CreateYarn(repository),
        updateYarn = UpdateYarn(repository),
        getTotalYarn = GetTotalYarn(repository),
        addTotalYarnDay = AddTotalYarnDay(repository),
        stockYarn = StockYarn(repository)
    )

    @Provides
    fun provideReflectiveUseCases(repository : ReflectiveRepository) = ReflectiveUseCases(
        createReflective = CreateReflective(repository),
        updateReflective = UpdateReflective(repository),
        getTotalReflective = GetTotalReflective(repository),
        addDateReflective = AddDateReflective(repository),
        addTotalReflectiveDay = AddTotalReflectiveDay(repository),
        stockReflective = StockReflective(repository)
    )

    @Provides
    fun provideButtonUseCases(repository : ButtonRepository) = ButtonUseCases(
        createButton = CreateButton(repository),
        updateButton = UpdateButton(repository),
        getTotalButton = GetTotalButton(repository),
        addTotalButtonDay = AddTotalButtonDay(repository),
        stockButton = StockButton(repository)
    )

    @Provides
    fun providePackingUseCases(repository : PackingRepository) = PackingUseCases(
        createPacking = CreatePacking(repository),
        updatePacking = UpdatePacking(repository),
        getTotalPacking = GetTotalPacking(repository),
        addDatePacking = AddDatePacking(repository),
        addTotalPackingDay = AddTotalPackingDay(repository),
        stockPacking = StockPacking(repository)
    )

    @Provides
    fun provideUtilsUseCases(repository : UtilsRepository) = UtilsUseCases(
        getList = GetList(repository)
    )

    @Provides
    fun providePackageUseCases(repository : PackageRepository) = PackageUseCases(
        getIdPackage = GetIdPackage(repository),
        createPackage = CreatePackage(repository),
        stockPackage = StockPackage(repository),
        updatePaidJob = UpdatePaidJob(repository),
        newGetPackageById = NewGetPackageById(repository)
    )

     */
}