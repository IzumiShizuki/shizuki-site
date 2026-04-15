.class public final Lcom/tencent/bugly/proguard/k;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/k$a;
    }
.end annotation


# instance fields
.field private a:Ljava/nio/ByteBuffer;

.field protected b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "GBK"

    .line 2
    iput-object v0, p0, Lcom/tencent/bugly/proguard/k;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "GBK"

    .line 4
    iput-object v0, p0, Lcom/tencent/bugly/proguard/k;->b:Ljava/lang/String;

    .line 5
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/k;->a:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "GBK"

    .line 7
    iput-object v0, p0, Lcom/tencent/bugly/proguard/k;->b:Ljava/lang/String;

    .line 8
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/k;->a:Ljava/nio/ByteBuffer;

    .line 9
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    return-void
.end method

.method public static a(Lcom/tencent/bugly/proguard/k$a;Ljava/nio/ByteBuffer;)I
    .locals 2

    .line 4
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    and-int/lit8 v1, v0, 0xf

    int-to-byte v1, v1

    .line 5
    iput-byte v1, p0, Lcom/tencent/bugly/proguard/k$a;->a:B

    and-int/lit16 v0, v0, 0xf0

    shr-int/lit8 v0, v0, 0x4

    .line 6
    iput v0, p0, Lcom/tencent/bugly/proguard/k$a;->b:I

    const/16 v1, 0xf

    if-ne v0, v1, :cond_0

    .line 7
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    iput p1, p0, Lcom/tencent/bugly/proguard/k$a;->b:I

    const/4 p0, 0x2

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0
.end method

.method private a(Ljava/util/Map;Ljava/util/Map;IZ)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "TK;TV;>;",
            "Ljava/util/Map<",
            "TK;TV;>;IZ)",
            "Ljava/util/Map<",
            "TK;TV;>;"
        }
    .end annotation

    if-eqz p2, :cond_6

    .line 135
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 136
    :cond_0
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    .line 137
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    .line 138
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    .line 139
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    .line 140
    invoke-virtual {p0, p3}, Lcom/tencent/bugly/proguard/k;->a(I)Z

    move-result p3

    if-eqz p3, :cond_3

    .line 141
    invoke-static {p0}, La0/c;->E(Lcom/tencent/bugly/proguard/k;)Lcom/tencent/bugly/proguard/k$a;

    move-result-object p3

    .line 142
    iget-byte p3, p3, Lcom/tencent/bugly/proguard/k$a;->a:B

    const/16 p4, 0x8

    if-ne p3, p4, :cond_2

    const/4 p3, 0x0

    const/4 p4, 0x1

    .line 143
    invoke-virtual {p0, p3, p3, p4}, Lcom/tencent/bugly/proguard/k;->a(IIZ)I

    move-result v1

    if-ltz v1, :cond_1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_4

    .line 144
    invoke-virtual {p0, v0, p3, p4}, Lcom/tencent/bugly/proguard/k;->a(Ljava/lang/Object;IZ)Ljava/lang/Object;

    move-result-object v3

    .line 145
    invoke-virtual {p0, p2, p4, p4}, Lcom/tencent/bugly/proguard/k;->a(Ljava/lang/Object;IZ)Ljava/lang/Object;

    move-result-object v4

    .line 146
    invoke-interface {p1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 147
    :cond_1
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "size invalid: "

    .line 148
    invoke-static {v1, p2}, Lq/t0;->B(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 149
    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1

    .line 150
    :cond_2
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "type mismatch."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    if-nez p4, :cond_5

    :cond_4
    return-object p1

    .line 151
    :cond_5
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "require field not exist."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1

    .line 152
    :cond_6
    :goto_1
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    return-object p1
.end method

.method private a(B)V
    .locals 5

    const/4 v0, 0x4

    const/16 v1, 0x8

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    packed-switch p1, :pswitch_data_0

    .line 18
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string v0, "invalid type."

    invoke-direct {p1, v0}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1

    .line 19
    :pswitch_0
    invoke-static {p0}, La0/c;->E(Lcom/tencent/bugly/proguard/k;)Lcom/tencent/bugly/proguard/k$a;

    move-result-object v0

    .line 20
    iget-byte v1, v0, Lcom/tencent/bugly/proguard/k$a;->a:B

    if-nez v1, :cond_0

    .line 21
    invoke-virtual {p0, v4, v4, v3}, Lcom/tencent/bugly/proguard/k;->a(IIZ)I

    move-result p1

    .line 22
    invoke-direct {p0, p1}, Lcom/tencent/bugly/proguard/k;->b(I)V

    return-void

    .line 23
    :cond_0
    new-instance v1, Lcom/tencent/bugly/proguard/h;

    const-string v2, "skipField with invalid type, type value: "

    const-string v3, ", "

    .line 24
    invoke-static {p1, v2, v3}, Lj2/h0;->o(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 25
    iget-byte v0, v0, Lcom/tencent/bugly/proguard/k$a;->a:B

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw v1

    .line 26
    :pswitch_1
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/k;->a()V

    return-void

    .line 27
    :pswitch_2
    invoke-virtual {p0, v4, v4, v3}, Lcom/tencent/bugly/proguard/k;->a(IIZ)I

    move-result p1

    :goto_0
    if-ge v4, p1, :cond_1

    .line 28
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/k;->b()V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 29
    :pswitch_3
    invoke-virtual {p0, v4, v4, v3}, Lcom/tencent/bugly/proguard/k;->a(IIZ)I

    move-result p1

    :goto_1
    mul-int/lit8 v0, p1, 0x2

    if-ge v4, v0, :cond_1

    .line 30
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/k;->b()V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    :pswitch_4
    return-void

    .line 31
    :pswitch_5
    iget-object p1, p0, Lcom/tencent/bugly/proguard/k;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/tencent/bugly/proguard/k;->b(I)V

    return-void

    .line 32
    :pswitch_6
    iget-object p1, p0, Lcom/tencent/bugly/proguard/k;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    if-gez p1, :cond_2

    add-int/lit16 p1, p1, 0x100

    .line 33
    :cond_2
    invoke-direct {p0, p1}, Lcom/tencent/bugly/proguard/k;->b(I)V

    return-void

    .line 34
    :pswitch_7
    invoke-direct {p0, v1}, Lcom/tencent/bugly/proguard/k;->b(I)V

    return-void

    .line 35
    :pswitch_8
    invoke-direct {p0, v0}, Lcom/tencent/bugly/proguard/k;->b(I)V

    return-void

    .line 36
    :pswitch_9
    invoke-direct {p0, v1}, Lcom/tencent/bugly/proguard/k;->b(I)V

    return-void

    .line 37
    :pswitch_a
    invoke-direct {p0, v0}, Lcom/tencent/bugly/proguard/k;->b(I)V

    return-void

    .line 38
    :pswitch_b
    invoke-direct {p0, v2}, Lcom/tencent/bugly/proguard/k;->b(I)V

    return-void

    .line 39
    :pswitch_c
    invoke-direct {p0, v3}, Lcom/tencent/bugly/proguard/k;->b(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_4
        :pswitch_4
        :pswitch_0
    .end packed-switch
.end method

.method private b(Lcom/tencent/bugly/proguard/k$a;)I
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/k;->a(Lcom/tencent/bugly/proguard/k$a;Ljava/nio/ByteBuffer;)I

    move-result p1

    return p1
.end method

.method private b()V
    .locals 1

    .line 1
    invoke-static {p0}, La0/c;->E(Lcom/tencent/bugly/proguard/k;)Lcom/tencent/bugly/proguard/k$a;

    move-result-object v0

    .line 2
    iget-byte v0, v0, Lcom/tencent/bugly/proguard/k$a;->a:B

    invoke-direct {p0, v0}, Lcom/tencent/bugly/proguard/k;->a(B)V

    return-void
.end method

.method private b(I)V
    .locals 2

    .line 7
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v1

    add-int/2addr v1, p1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    return-void
.end method

.method private b(Ljava/lang/Object;IZ)[Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;IZ)[TT;"
        }
    .end annotation

    .line 8
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/k;->a(I)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 9
    invoke-static {p0}, La0/c;->E(Lcom/tencent/bugly/proguard/k;)Lcom/tencent/bugly/proguard/k$a;

    move-result-object p2

    .line 10
    iget-byte p2, p2, Lcom/tencent/bugly/proguard/k$a;->a:B

    const/16 p3, 0x9

    if-ne p2, p3, :cond_2

    const/4 p2, 0x0

    const/4 p3, 0x1

    .line 11
    invoke-virtual {p0, p2, p2, p3}, Lcom/tencent/bugly/proguard/k;->a(IIZ)I

    move-result v0

    if-ltz v0, :cond_1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 13
    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/bugly/proguard/k;->a(Ljava/lang/Object;IZ)Ljava/lang/Object;

    move-result-object v3

    .line 14
    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1

    .line 15
    :cond_1
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "size invalid: "

    .line 16
    invoke-static {v0, p2}, Lq/t0;->B(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 17
    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1

    .line 18
    :cond_2
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "type mismatch."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    if-nez p3, :cond_4

    const/4 p1, 0x0

    return-object p1

    .line 19
    :cond_4
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "require field not exist."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a(BIZ)B
    .locals 0

    .line 48
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/k;->a(I)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 49
    invoke-static {p0}, La0/c;->E(Lcom/tencent/bugly/proguard/k;)Lcom/tencent/bugly/proguard/k$a;

    move-result-object p1

    .line 50
    iget-byte p1, p1, Lcom/tencent/bugly/proguard/k$a;->a:B

    if-eqz p1, :cond_1

    const/16 p2, 0xc

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    return p1

    .line 51
    :cond_0
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "type mismatch."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1

    .line 52
    :cond_1
    iget-object p1, p0, Lcom/tencent/bugly/proguard/k;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    return p1

    :cond_2
    if-nez p3, :cond_3

    return p1

    .line 53
    :cond_3
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "require field not exist."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(DIZ)D
    .locals 0

    .line 99
    invoke-virtual {p0, p3}, Lcom/tencent/bugly/proguard/k;->a(I)Z

    move-result p3

    if-eqz p3, :cond_3

    .line 100
    invoke-static {p0}, La0/c;->E(Lcom/tencent/bugly/proguard/k;)Lcom/tencent/bugly/proguard/k$a;

    move-result-object p1

    .line 101
    iget-byte p1, p1, Lcom/tencent/bugly/proguard/k$a;->a:B

    const/4 p2, 0x4

    if-eq p1, p2, :cond_2

    const/4 p2, 0x5

    if-eq p1, p2, :cond_1

    const/16 p2, 0xc

    if-ne p1, p2, :cond_0

    const-wide/16 p1, 0x0

    return-wide p1

    .line 102
    :cond_0
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "type mismatch."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1

    .line 103
    :cond_1
    iget-object p1, p0, Lcom/tencent/bugly/proguard/k;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getDouble()D

    move-result-wide p1

    return-wide p1

    .line 104
    :cond_2
    iget-object p1, p0, Lcom/tencent/bugly/proguard/k;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getFloat()F

    move-result p1

    float-to-double p1, p1

    return-wide p1

    :cond_3
    if-nez p4, :cond_4

    return-wide p1

    .line 105
    :cond_4
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "require field not exist."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(FIZ)F
    .locals 0

    .line 90
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/k;->a(I)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 91
    invoke-static {p0}, La0/c;->E(Lcom/tencent/bugly/proguard/k;)Lcom/tencent/bugly/proguard/k$a;

    move-result-object p1

    .line 92
    iget-byte p1, p1, Lcom/tencent/bugly/proguard/k$a;->a:B

    const/4 p2, 0x4

    if-eq p1, p2, :cond_1

    const/16 p2, 0xc

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    return p1

    .line 93
    :cond_0
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "type mismatch."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1

    .line 94
    :cond_1
    iget-object p1, p0, Lcom/tencent/bugly/proguard/k;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getFloat()F

    move-result p1

    return p1

    :cond_2
    if-nez p3, :cond_3

    return p1

    .line 95
    :cond_3
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "require field not exist."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(IIZ)I
    .locals 0

    .line 67
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/k;->a(I)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 68
    invoke-static {p0}, La0/c;->E(Lcom/tencent/bugly/proguard/k;)Lcom/tencent/bugly/proguard/k$a;

    move-result-object p1

    .line 69
    iget-byte p1, p1, Lcom/tencent/bugly/proguard/k$a;->a:B

    if-eqz p1, :cond_3

    const/4 p2, 0x1

    if-eq p1, p2, :cond_2

    const/4 p2, 0x2

    if-eq p1, p2, :cond_1

    const/16 p2, 0xc

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    return p1

    .line 70
    :cond_0
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "type mismatch."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1

    .line 71
    :cond_1
    iget-object p1, p0, Lcom/tencent/bugly/proguard/k;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p1

    return p1

    .line 72
    :cond_2
    iget-object p1, p0, Lcom/tencent/bugly/proguard/k;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getShort()S

    move-result p1

    return p1

    .line 73
    :cond_3
    iget-object p1, p0, Lcom/tencent/bugly/proguard/k;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    return p1

    :cond_4
    if-nez p3, :cond_5

    return p1

    .line 74
    :cond_5
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "require field not exist."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Ljava/lang/String;)I
    .locals 0

    .line 369
    iput-object p1, p0, Lcom/tencent/bugly/proguard/k;->b:Ljava/lang/String;

    const/4 p1, 0x0

    return p1
.end method

.method public a(JIZ)J
    .locals 0

    .line 78
    invoke-virtual {p0, p3}, Lcom/tencent/bugly/proguard/k;->a(I)Z

    move-result p3

    if-eqz p3, :cond_5

    .line 79
    invoke-static {p0}, La0/c;->E(Lcom/tencent/bugly/proguard/k;)Lcom/tencent/bugly/proguard/k$a;

    move-result-object p1

    .line 80
    iget-byte p1, p1, Lcom/tencent/bugly/proguard/k$a;->a:B

    const/16 p2, 0xc

    if-eq p1, p2, :cond_4

    if-eqz p1, :cond_3

    const/4 p2, 0x1

    if-eq p1, p2, :cond_2

    const/4 p2, 0x2

    if-eq p1, p2, :cond_1

    const/4 p2, 0x3

    if-ne p1, p2, :cond_0

    .line 81
    iget-object p1, p0, Lcom/tencent/bugly/proguard/k;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getLong()J

    move-result-wide p1

    return-wide p1

    .line 82
    :cond_0
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "type mismatch."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1

    .line 83
    :cond_1
    iget-object p1, p0, Lcom/tencent/bugly/proguard/k;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p1

    int-to-long p1, p1

    return-wide p1

    .line 84
    :cond_2
    iget-object p1, p0, Lcom/tencent/bugly/proguard/k;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getShort()S

    move-result p1

    int-to-long p1, p1

    return-wide p1

    .line 85
    :cond_3
    iget-object p1, p0, Lcom/tencent/bugly/proguard/k;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    int-to-long p1, p1

    return-wide p1

    :cond_4
    const-wide/16 p1, 0x0

    return-wide p1

    :cond_5
    if-nez p4, :cond_6

    return-wide p1

    .line 86
    :cond_6
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "require field not exist."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Lcom/tencent/bugly/proguard/m;IZ)Lcom/tencent/bugly/proguard/m;
    .locals 0

    .line 317
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/k;->a(I)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 318
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/tencent/bugly/proguard/m;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 319
    invoke-static {p0}, La0/c;->E(Lcom/tencent/bugly/proguard/k;)Lcom/tencent/bugly/proguard/k$a;

    move-result-object p2

    .line 320
    iget-byte p2, p2, Lcom/tencent/bugly/proguard/k$a;->a:B

    const/16 p3, 0xa

    if-ne p2, p3, :cond_0

    .line 321
    invoke-virtual {p1, p0}, Lcom/tencent/bugly/proguard/m;->a(Lcom/tencent/bugly/proguard/k;)V

    .line 322
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/k;->a()V

    return-object p1

    .line 323
    :cond_0
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "type mismatch."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_0
    move-exception p1

    .line 324
    new-instance p2, Lcom/tencent/bugly/proguard/h;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    if-nez p3, :cond_2

    const/4 p1, 0x0

    return-object p1

    .line 325
    :cond_2
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "require field not exist."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Ljava/lang/Object;IZ)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;IZ)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 329
    instance-of v0, p1, Ljava/lang/Byte;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 330
    invoke-virtual {p0, v1, p2, p3}, Lcom/tencent/bugly/proguard/k;->a(BIZ)B

    move-result p1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    .line 331
    :cond_0
    instance-of v0, p1, Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    .line 332
    invoke-virtual {p0, v1, p2, p3}, Lcom/tencent/bugly/proguard/k;->a(ZIZ)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 333
    :cond_1
    instance-of v0, p1, Ljava/lang/Short;

    if-eqz v0, :cond_2

    .line 334
    invoke-virtual {p0, v1, p2, p3}, Lcom/tencent/bugly/proguard/k;->a(SIZ)S

    move-result p1

    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    return-object p1

    .line 335
    :cond_2
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_3

    .line 336
    invoke-virtual {p0, v1, p2, p3}, Lcom/tencent/bugly/proguard/k;->a(IIZ)I

    move-result p1

    .line 337
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    .line 338
    :cond_3
    instance-of v0, p1, Ljava/lang/Long;

    if-eqz v0, :cond_4

    const-wide/16 v0, 0x0

    .line 339
    invoke-virtual {p0, v0, v1, p2, p3}, Lcom/tencent/bugly/proguard/k;->a(JIZ)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    .line 340
    :cond_4
    instance-of v0, p1, Ljava/lang/Float;

    if-eqz v0, :cond_5

    const/4 p1, 0x0

    .line 341
    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/bugly/proguard/k;->a(FIZ)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    .line 342
    :cond_5
    instance-of v0, p1, Ljava/lang/Double;

    if-eqz v0, :cond_6

    const-wide/16 v0, 0x0

    .line 343
    invoke-virtual {p0, v0, v1, p2, p3}, Lcom/tencent/bugly/proguard/k;->a(DIZ)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    .line 344
    :cond_6
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_7

    .line 345
    invoke-virtual {p0, p2, p3}, Lcom/tencent/bugly/proguard/k;->a(IZ)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 346
    :cond_7
    instance-of v0, p1, Ljava/util/Map;

    if-eqz v0, :cond_8

    .line 347
    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/bugly/proguard/k;->a(Ljava/util/Map;IZ)Ljava/util/HashMap;

    move-result-object p1

    return-object p1

    .line 348
    :cond_8
    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_9

    .line 349
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/bugly/proguard/k;->a(Ljava/util/List;IZ)Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 350
    :cond_9
    instance-of v0, p1, Lcom/tencent/bugly/proguard/m;

    if-eqz v0, :cond_a

    .line 351
    check-cast p1, Lcom/tencent/bugly/proguard/m;

    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/bugly/proguard/k;->a(Lcom/tencent/bugly/proguard/m;IZ)Lcom/tencent/bugly/proguard/m;

    move-result-object p1

    return-object p1

    .line 352
    :cond_a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_13

    .line 353
    instance-of v0, p1, [B

    const/4 v1, 0x0

    if-nez v0, :cond_12

    instance-of v0, p1, [Ljava/lang/Byte;

    if-eqz v0, :cond_b

    goto :goto_0

    .line 354
    :cond_b
    instance-of v0, p1, [Z

    if-eqz v0, :cond_c

    .line 355
    invoke-virtual {p0, v1, p2, p3}, Lcom/tencent/bugly/proguard/k;->a([ZIZ)[Z

    move-result-object p1

    return-object p1

    .line 356
    :cond_c
    instance-of v0, p1, [S

    if-eqz v0, :cond_d

    .line 357
    invoke-virtual {p0, v1, p2, p3}, Lcom/tencent/bugly/proguard/k;->a([SIZ)[S

    move-result-object p1

    return-object p1

    .line 358
    :cond_d
    instance-of v0, p1, [I

    if-eqz v0, :cond_e

    .line 359
    invoke-virtual {p0, v1, p2, p3}, Lcom/tencent/bugly/proguard/k;->a([IIZ)[I

    move-result-object p1

    return-object p1

    .line 360
    :cond_e
    instance-of v0, p1, [J

    if-eqz v0, :cond_f

    .line 361
    invoke-virtual {p0, v1, p2, p3}, Lcom/tencent/bugly/proguard/k;->a([JIZ)[J

    move-result-object p1

    return-object p1

    .line 362
    :cond_f
    instance-of v0, p1, [F

    if-eqz v0, :cond_10

    .line 363
    invoke-virtual {p0, v1, p2, p3}, Lcom/tencent/bugly/proguard/k;->a([FIZ)[F

    move-result-object p1

    return-object p1

    .line 364
    :cond_10
    instance-of v0, p1, [D

    if-eqz v0, :cond_11

    .line 365
    invoke-virtual {p0, v1, p2, p3}, Lcom/tencent/bugly/proguard/k;->a([DIZ)[D

    move-result-object p1

    return-object p1

    .line 366
    :cond_11
    check-cast p1, [Ljava/lang/Object;

    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/bugly/proguard/k;->a([Ljava/lang/Object;IZ)[Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 367
    :cond_12
    :goto_0
    invoke-virtual {p0, v1, p2, p3}, Lcom/tencent/bugly/proguard/k;->a([BIZ)[B

    move-result-object p1

    return-object p1

    .line 368
    :cond_13
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "read object error: unsupport type."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(IZ)Ljava/lang/String;
    .locals 1

    .line 109
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/k;->a(I)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 110
    invoke-static {p0}, La0/c;->E(Lcom/tencent/bugly/proguard/k;)Lcom/tencent/bugly/proguard/k$a;

    move-result-object p1

    .line 111
    iget-byte p1, p1, Lcom/tencent/bugly/proguard/k$a;->a:B

    const/4 p2, 0x6

    if-eq p1, p2, :cond_2

    const/4 p2, 0x7

    if-ne p1, p2, :cond_1

    .line 112
    iget-object p1, p0, Lcom/tencent/bugly/proguard/k;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p1

    const/high16 p2, 0x6400000

    if-gt p1, p2, :cond_0

    if-ltz p1, :cond_0

    .line 113
    new-array p1, p1, [B

    .line 114
    iget-object p2, p0, Lcom/tencent/bugly/proguard/k;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 115
    :try_start_0
    new-instance p2, Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/bugly/proguard/k;->b:Ljava/lang/String;

    invoke-direct {p2, p1, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    .line 116
    :catch_0
    new-instance p2, Ljava/lang/String;

    invoke-direct {p2, p1}, Ljava/lang/String;-><init>([B)V

    goto :goto_0

    .line 117
    :cond_0
    new-instance p2, Lcom/tencent/bugly/proguard/h;

    const-string v0, "String too long: "

    .line 118
    invoke-static {p1, v0}, Lq/t0;->B(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 119
    invoke-direct {p2, p1}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p2

    .line 120
    :cond_1
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "type mismatch."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1

    .line 121
    :cond_2
    iget-object p1, p0, Lcom/tencent/bugly/proguard/k;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    if-gez p1, :cond_3

    add-int/lit16 p1, p1, 0x100

    .line 122
    :cond_3
    new-array p1, p1, [B

    .line 123
    iget-object p2, p0, Lcom/tencent/bugly/proguard/k;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 124
    :try_start_1
    new-instance p2, Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/bugly/proguard/k;->b:Ljava/lang/String;

    invoke-direct {p2, p1, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p2

    .line 125
    :catch_1
    new-instance p2, Ljava/lang/String;

    invoke-direct {p2, p1}, Ljava/lang/String;-><init>([B)V

    :goto_0
    return-object p2

    :cond_4
    if-nez p2, :cond_5

    const/4 p1, 0x0

    return-object p1

    .line 126
    :cond_5
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "require field not exist."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Ljava/util/Map;IZ)Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "TK;TV;>;IZ)",
            "Ljava/util/HashMap<",
            "TK;TV;>;"
        }
    .end annotation

    .line 134
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/tencent/bugly/proguard/k;->a(Ljava/util/Map;Ljava/util/Map;IZ)Ljava/util/Map;

    move-result-object p1

    check-cast p1, Ljava/util/HashMap;

    return-object p1
.end method

.method public a(Ljava/util/List;IZ)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;IZ)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    if-eqz p1, :cond_3

    .line 311
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 312
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Lcom/tencent/bugly/proguard/k;->b(Ljava/lang/Object;IZ)[Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return-object p1

    .line 313
    :cond_1
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 314
    :goto_0
    array-length p3, p1

    if-ge v0, p3, :cond_2

    .line 315
    aget-object p3, p1, v0

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-object p2

    .line 316
    :cond_3
    :goto_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1
.end method

.method public a(SIZ)S
    .locals 0

    .line 57
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/k;->a(I)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 58
    invoke-static {p0}, La0/c;->E(Lcom/tencent/bugly/proguard/k;)Lcom/tencent/bugly/proguard/k$a;

    move-result-object p1

    .line 59
    iget-byte p1, p1, Lcom/tencent/bugly/proguard/k$a;->a:B

    if-eqz p1, :cond_2

    const/4 p2, 0x1

    if-eq p1, p2, :cond_1

    const/16 p2, 0xc

    if-ne p1, p2, :cond_0

    const/4 p1, 0x0

    return p1

    .line 60
    :cond_0
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "type mismatch."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1

    .line 61
    :cond_1
    iget-object p1, p0, Lcom/tencent/bugly/proguard/k;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getShort()S

    move-result p1

    return p1

    .line 62
    :cond_2
    iget-object p1, p0, Lcom/tencent/bugly/proguard/k;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    int-to-short p1, p1

    return p1

    :cond_3
    if-nez p3, :cond_4

    return p1

    .line 63
    :cond_4
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "require field not exist."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a()V
    .locals 3

    .line 14
    new-instance v0, Lcom/tencent/bugly/proguard/k$a;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/k$a;-><init>()V

    .line 15
    :cond_0
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/k;->a(Lcom/tencent/bugly/proguard/k$a;)V

    .line 16
    iget-byte v1, v0, Lcom/tencent/bugly/proguard/k$a;->a:B

    invoke-direct {p0, v1}, Lcom/tencent/bugly/proguard/k;->a(B)V

    .line 17
    iget-byte v1, v0, Lcom/tencent/bugly/proguard/k$a;->a:B

    const/16 v2, 0xb

    if-ne v1, v2, :cond_0

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/k$a;)V
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k;->a:Ljava/nio/ByteBuffer;

    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/k;->a(Lcom/tencent/bugly/proguard/k$a;Ljava/nio/ByteBuffer;)I

    return-void
.end method

.method public a([B)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k;->a:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 3
    :cond_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/k;->a:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public a(I)Z
    .locals 6

    const/4 v0, 0x0

    .line 9
    :try_start_0
    new-instance v1, Lcom/tencent/bugly/proguard/k$a;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/k$a;-><init>()V

    .line 10
    :goto_0
    invoke-direct {p0, v1}, Lcom/tencent/bugly/proguard/k;->b(Lcom/tencent/bugly/proguard/k$a;)I

    move-result v2

    .line 11
    iget v3, v1, Lcom/tencent/bugly/proguard/k$a;->b:I

    if-le p1, v3, :cond_1

    iget-byte v4, v1, Lcom/tencent/bugly/proguard/k$a;->a:B

    const/16 v5, 0xb

    if-ne v4, v5, :cond_0

    goto :goto_1

    .line 12
    :cond_0
    invoke-direct {p0, v2}, Lcom/tencent/bugly/proguard/k;->b(I)V

    .line 13
    iget-byte v2, v1, Lcom/tencent/bugly/proguard/k$a;->a:B

    invoke-direct {p0, v2}, Lcom/tencent/bugly/proguard/k;->a(B)V
    :try_end_0
    .catch Lcom/tencent/bugly/proguard/h; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/nio/BufferUnderflowException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_1
    :goto_1
    if-ne p1, v3, :cond_2

    const/4 p1, 0x1

    return p1

    :catch_0
    :cond_2
    return v0
.end method

.method public a(ZIZ)Z
    .locals 0

    const/4 p1, 0x0

    .line 47
    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/bugly/proguard/k;->a(BIZ)B

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    :cond_0
    return p1
.end method

.method public a([BIZ)[B
    .locals 5

    .line 178
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/k;->a(I)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 179
    invoke-static {p0}, La0/c;->E(Lcom/tencent/bugly/proguard/k;)Lcom/tencent/bugly/proguard/k$a;

    move-result-object p1

    .line 180
    iget-byte p3, p1, Lcom/tencent/bugly/proguard/k$a;->a:B

    const/16 v0, 0x9

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p3, v0, :cond_3

    const/16 v0, 0xd

    if-ne p3, v0, :cond_2

    .line 181
    invoke-static {p0}, La0/c;->E(Lcom/tencent/bugly/proguard/k;)Lcom/tencent/bugly/proguard/k$a;

    move-result-object p3

    .line 182
    iget-byte v0, p3, Lcom/tencent/bugly/proguard/k$a;->a:B

    const-string v3, ", "

    const-string v4, ", type: "

    if-nez v0, :cond_1

    .line 183
    invoke-virtual {p0, v2, v2, v1}, Lcom/tencent/bugly/proguard/k;->a(IIZ)I

    move-result v0

    if-ltz v0, :cond_0

    .line 184
    new-array p1, v0, [B

    .line 185
    iget-object p2, p0, Lcom/tencent/bugly/proguard/k;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    return-object p1

    .line 186
    :cond_0
    new-instance v1, Lcom/tencent/bugly/proguard/h;

    const-string v2, "invalid size, tag: "

    .line 187
    invoke-static {p2, v2, v4}, Lj2/h0;->o(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 188
    iget-byte p1, p1, Lcom/tencent/bugly/proguard/k$a;->a:B

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte p1, p3, Lcom/tencent/bugly/proguard/k$a;->a:B

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", size: "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw v1

    .line 189
    :cond_1
    new-instance v0, Lcom/tencent/bugly/proguard/h;

    const-string v1, "type mismatch, tag: "

    .line 190
    invoke-static {p2, v1, v4}, Lj2/h0;->o(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 191
    iget-byte p1, p1, Lcom/tencent/bugly/proguard/k$a;->a:B

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte p1, p3, Lcom/tencent/bugly/proguard/k$a;->a:B

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw v0

    .line 192
    :cond_2
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "type mismatch."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1

    .line 193
    :cond_3
    invoke-virtual {p0, v2, v2, v1}, Lcom/tencent/bugly/proguard/k;->a(IIZ)I

    move-result p1

    if-ltz p1, :cond_5

    .line 194
    new-array p2, p1, [B

    const/4 p3, 0x0

    :goto_0
    if-ge p3, p1, :cond_4

    .line 195
    aget-byte v0, p2, v2

    invoke-virtual {p0, v0, v2, v1}, Lcom/tencent/bugly/proguard/k;->a(BIZ)B

    move-result v0

    aput-byte v0, p2, p3

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_4
    return-object p2

    .line 196
    :cond_5
    new-instance p2, Lcom/tencent/bugly/proguard/h;

    const-string p3, "size invalid: "

    .line 197
    invoke-static {p1, p3}, Lq/t0;->B(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 198
    invoke-direct {p2, p1}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_6
    if-nez p3, :cond_7

    const/4 p1, 0x0

    return-object p1

    .line 199
    :cond_7
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "require field not exist."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a([DIZ)[D
    .locals 4

    .line 290
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/k;->a(I)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 291
    invoke-static {p0}, La0/c;->E(Lcom/tencent/bugly/proguard/k;)Lcom/tencent/bugly/proguard/k$a;

    move-result-object p1

    .line 292
    iget-byte p1, p1, Lcom/tencent/bugly/proguard/k$a;->a:B

    const/16 p2, 0x9

    if-ne p1, p2, :cond_2

    const/4 p1, 0x0

    const/4 p2, 0x1

    .line 293
    invoke-virtual {p0, p1, p1, p2}, Lcom/tencent/bugly/proguard/k;->a(IIZ)I

    move-result p3

    if-ltz p3, :cond_1

    .line 294
    new-array v0, p3, [D

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p3, :cond_0

    .line 295
    aget-wide v2, v0, p1

    invoke-virtual {p0, v2, v3, p1, p2}, Lcom/tencent/bugly/proguard/k;->a(DIZ)D

    move-result-wide v2

    aput-wide v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0

    .line 296
    :cond_1
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "size invalid: "

    .line 297
    invoke-static {p3, p2}, Lq/t0;->B(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 298
    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1

    .line 299
    :cond_2
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "type mismatch."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    if-nez p3, :cond_4

    const/4 p1, 0x0

    return-object p1

    .line 300
    :cond_4
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "require field not exist."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a([FIZ)[F
    .locals 3

    .line 272
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/k;->a(I)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 273
    invoke-static {p0}, La0/c;->E(Lcom/tencent/bugly/proguard/k;)Lcom/tencent/bugly/proguard/k$a;

    move-result-object p1

    .line 274
    iget-byte p1, p1, Lcom/tencent/bugly/proguard/k$a;->a:B

    const/16 p2, 0x9

    if-ne p1, p2, :cond_2

    const/4 p1, 0x0

    const/4 p2, 0x1

    .line 275
    invoke-virtual {p0, p1, p1, p2}, Lcom/tencent/bugly/proguard/k;->a(IIZ)I

    move-result p3

    if-ltz p3, :cond_1

    .line 276
    new-array v0, p3, [F

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p3, :cond_0

    .line 277
    aget v2, v0, p1

    invoke-virtual {p0, v2, p1, p2}, Lcom/tencent/bugly/proguard/k;->a(FIZ)F

    move-result v2

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0

    .line 278
    :cond_1
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "size invalid: "

    .line 279
    invoke-static {p3, p2}, Lq/t0;->B(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 280
    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1

    .line 281
    :cond_2
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "type mismatch."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    if-nez p3, :cond_4

    const/4 p1, 0x0

    return-object p1

    .line 282
    :cond_4
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "require field not exist."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a([IIZ)[I
    .locals 3

    .line 236
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/k;->a(I)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 237
    invoke-static {p0}, La0/c;->E(Lcom/tencent/bugly/proguard/k;)Lcom/tencent/bugly/proguard/k$a;

    move-result-object p1

    .line 238
    iget-byte p1, p1, Lcom/tencent/bugly/proguard/k$a;->a:B

    const/16 p2, 0x9

    if-ne p1, p2, :cond_2

    const/4 p1, 0x0

    const/4 p2, 0x1

    .line 239
    invoke-virtual {p0, p1, p1, p2}, Lcom/tencent/bugly/proguard/k;->a(IIZ)I

    move-result p3

    if-ltz p3, :cond_1

    .line 240
    new-array v0, p3, [I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p3, :cond_0

    .line 241
    aget v2, v0, p1

    invoke-virtual {p0, v2, p1, p2}, Lcom/tencent/bugly/proguard/k;->a(IIZ)I

    move-result v2

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0

    .line 242
    :cond_1
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "size invalid: "

    .line 243
    invoke-static {p3, p2}, Lq/t0;->B(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 244
    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1

    .line 245
    :cond_2
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "type mismatch."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    if-nez p3, :cond_4

    const/4 p1, 0x0

    return-object p1

    .line 246
    :cond_4
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "require field not exist."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a([JIZ)[J
    .locals 4

    .line 254
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/k;->a(I)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 255
    invoke-static {p0}, La0/c;->E(Lcom/tencent/bugly/proguard/k;)Lcom/tencent/bugly/proguard/k$a;

    move-result-object p1

    .line 256
    iget-byte p1, p1, Lcom/tencent/bugly/proguard/k$a;->a:B

    const/16 p2, 0x9

    if-ne p1, p2, :cond_2

    const/4 p1, 0x0

    const/4 p2, 0x1

    .line 257
    invoke-virtual {p0, p1, p1, p2}, Lcom/tencent/bugly/proguard/k;->a(IIZ)I

    move-result p3

    if-ltz p3, :cond_1

    .line 258
    new-array v0, p3, [J

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p3, :cond_0

    .line 259
    aget-wide v2, v0, p1

    invoke-virtual {p0, v2, v3, p1, p2}, Lcom/tencent/bugly/proguard/k;->a(JIZ)J

    move-result-wide v2

    aput-wide v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0

    .line 260
    :cond_1
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "size invalid: "

    .line 261
    invoke-static {p3, p2}, Lq/t0;->B(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 262
    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1

    .line 263
    :cond_2
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "type mismatch."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    if-nez p3, :cond_4

    const/4 p1, 0x0

    return-object p1

    .line 264
    :cond_4
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "require field not exist."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a([Ljava/lang/Object;IZ)[Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;IZ)[TT;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 308
    array-length v0, p1

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 309
    aget-object p1, p1, v0

    invoke-direct {p0, p1, p2, p3}, Lcom/tencent/bugly/proguard/k;->b(Ljava/lang/Object;IZ)[Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 310
    :cond_0
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "unable to get type of key and value."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a([SIZ)[S
    .locals 3

    .line 218
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/k;->a(I)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 219
    invoke-static {p0}, La0/c;->E(Lcom/tencent/bugly/proguard/k;)Lcom/tencent/bugly/proguard/k$a;

    move-result-object p1

    .line 220
    iget-byte p1, p1, Lcom/tencent/bugly/proguard/k$a;->a:B

    const/16 p2, 0x9

    if-ne p1, p2, :cond_2

    const/4 p1, 0x0

    const/4 p2, 0x1

    .line 221
    invoke-virtual {p0, p1, p1, p2}, Lcom/tencent/bugly/proguard/k;->a(IIZ)I

    move-result p3

    if-ltz p3, :cond_1

    .line 222
    new-array v0, p3, [S

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p3, :cond_0

    .line 223
    aget-short v2, v0, p1

    invoke-virtual {p0, v2, p1, p2}, Lcom/tencent/bugly/proguard/k;->a(SIZ)S

    move-result v2

    aput-short v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0

    .line 224
    :cond_1
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "size invalid: "

    .line 225
    invoke-static {p3, p2}, Lq/t0;->B(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 226
    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1

    .line 227
    :cond_2
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "type mismatch."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    if-nez p3, :cond_4

    const/4 p1, 0x0

    return-object p1

    .line 228
    :cond_4
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "require field not exist."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a([ZIZ)[Z
    .locals 3

    .line 160
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/k;->a(I)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 161
    invoke-static {p0}, La0/c;->E(Lcom/tencent/bugly/proguard/k;)Lcom/tencent/bugly/proguard/k$a;

    move-result-object p1

    .line 162
    iget-byte p1, p1, Lcom/tencent/bugly/proguard/k$a;->a:B

    const/16 p2, 0x9

    if-ne p1, p2, :cond_2

    const/4 p1, 0x0

    const/4 p2, 0x1

    .line 163
    invoke-virtual {p0, p1, p1, p2}, Lcom/tencent/bugly/proguard/k;->a(IIZ)I

    move-result p3

    if-ltz p3, :cond_1

    .line 164
    new-array v0, p3, [Z

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p3, :cond_0

    .line 165
    aget-boolean v2, v0, p1

    invoke-virtual {p0, v2, p1, p2}, Lcom/tencent/bugly/proguard/k;->a(ZIZ)Z

    move-result v2

    aput-boolean v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0

    .line 166
    :cond_1
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "size invalid: "

    .line 167
    invoke-static {p3, p2}, Lq/t0;->B(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 168
    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1

    .line 169
    :cond_2
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "type mismatch."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    if-nez p3, :cond_4

    const/4 p1, 0x0

    return-object p1

    .line 170
    :cond_4
    new-instance p1, Lcom/tencent/bugly/proguard/h;

    const-string p2, "require field not exist."

    invoke-direct {p1, p2}, Lcom/tencent/bugly/proguard/h;-><init>(Ljava/lang/String;)V

    throw p1
.end method
