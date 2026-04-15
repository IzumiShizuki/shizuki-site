.class public final Lcom/tencent/bugly/proguard/B;
.super Lcom/tencent/bugly/proguard/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field static a:Lcom/tencent/bugly/proguard/y; = null

.field static b:Lcom/tencent/bugly/proguard/x; = null

.field static c:Lcom/tencent/bugly/proguard/x; = null

.field static d:Ljava/util/Map; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field static final synthetic e:Z = true


# instance fields
.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:J

.field public i:I

.field public j:Lcom/tencent/bugly/proguard/y;

.field public k:Lcom/tencent/bugly/proguard/x;

.field public l:B

.field public m:I

.field public n:J

.field public o:Lcom/tencent/bugly/proguard/x;

.field public p:Ljava/lang/String;

.field public q:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public r:Ljava/lang/String;

.field public s:I

.field public t:J

.field public u:I


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/m;-><init>()V

    .line 2
    const-string v0, ""

    iput-object v0, p0, Lcom/tencent/bugly/proguard/B;->f:Ljava/lang/String;

    .line 3
    iput-object v0, p0, Lcom/tencent/bugly/proguard/B;->g:Ljava/lang/String;

    const-wide/16 v1, 0x0

    .line 4
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/B;->h:J

    const/4 v3, 0x0

    .line 5
    iput v3, p0, Lcom/tencent/bugly/proguard/B;->i:I

    const/4 v4, 0x0

    .line 6
    iput-object v4, p0, Lcom/tencent/bugly/proguard/B;->j:Lcom/tencent/bugly/proguard/y;

    .line 7
    iput-object v4, p0, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    .line 8
    iput-byte v3, p0, Lcom/tencent/bugly/proguard/B;->l:B

    .line 9
    iput v3, p0, Lcom/tencent/bugly/proguard/B;->m:I

    .line 10
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/B;->n:J

    .line 11
    iput-object v4, p0, Lcom/tencent/bugly/proguard/B;->o:Lcom/tencent/bugly/proguard/x;

    .line 12
    iput-object v0, p0, Lcom/tencent/bugly/proguard/B;->p:Ljava/lang/String;

    .line 13
    iput-object v4, p0, Lcom/tencent/bugly/proguard/B;->q:Ljava/util/Map;

    .line 14
    iput-object v0, p0, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    .line 15
    iput v3, p0, Lcom/tencent/bugly/proguard/B;->s:I

    .line 16
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/B;->t:J

    .line 17
    iput v3, p0, Lcom/tencent/bugly/proguard/B;->u:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JILcom/tencent/bugly/proguard/y;Lcom/tencent/bugly/proguard/x;BIJLcom/tencent/bugly/proguard/x;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;IJI)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JI",
            "Lcom/tencent/bugly/proguard/y;",
            "Lcom/tencent/bugly/proguard/x;",
            "BIJ",
            "Lcom/tencent/bugly/proguard/x;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "IJI)V"
        }
    .end annotation

    .line 18
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/m;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/tencent/bugly/proguard/B;->f:Ljava/lang/String;

    .line 20
    iput-object p2, p0, Lcom/tencent/bugly/proguard/B;->g:Ljava/lang/String;

    .line 21
    iput-wide p3, p0, Lcom/tencent/bugly/proguard/B;->h:J

    .line 22
    iput p5, p0, Lcom/tencent/bugly/proguard/B;->i:I

    .line 23
    iput-object p6, p0, Lcom/tencent/bugly/proguard/B;->j:Lcom/tencent/bugly/proguard/y;

    .line 24
    iput-object p7, p0, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    .line 25
    iput-byte p8, p0, Lcom/tencent/bugly/proguard/B;->l:B

    .line 26
    iput p9, p0, Lcom/tencent/bugly/proguard/B;->m:I

    .line 27
    iput-wide p10, p0, Lcom/tencent/bugly/proguard/B;->n:J

    .line 28
    iput-object p12, p0, Lcom/tencent/bugly/proguard/B;->o:Lcom/tencent/bugly/proguard/x;

    .line 29
    iput-object p13, p0, Lcom/tencent/bugly/proguard/B;->p:Ljava/lang/String;

    .line 30
    iput-object p14, p0, Lcom/tencent/bugly/proguard/B;->q:Ljava/util/Map;

    .line 31
    iput-object p15, p0, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    move/from16 p1, p16

    .line 32
    iput p1, p0, Lcom/tencent/bugly/proguard/B;->s:I

    move-wide/from16 p1, p17

    .line 33
    iput-wide p1, p0, Lcom/tencent/bugly/proguard/B;->t:J

    move/from16 p1, p19

    .line 34
    iput p1, p0, Lcom/tencent/bugly/proguard/B;->u:I

    return-void
.end method


# virtual methods
.method public a()Lcom/tencent/bugly/proguard/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    return-object v0
.end method

.method public a(Lcom/tencent/bugly/proguard/k;)V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 22
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/k;->a(IZ)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/tencent/bugly/proguard/B;->f:Ljava/lang/String;

    .line 23
    invoke-virtual {p1, v1, v1}, Lcom/tencent/bugly/proguard/k;->a(IZ)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/tencent/bugly/proguard/B;->g:Ljava/lang/String;

    .line 24
    iget-wide v2, p0, Lcom/tencent/bugly/proguard/B;->h:J

    const/4 v4, 0x2

    invoke-virtual {p1, v2, v3, v4, v1}, Lcom/tencent/bugly/proguard/k;->a(JIZ)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/tencent/bugly/proguard/B;->h:J

    .line 25
    iget v2, p0, Lcom/tencent/bugly/proguard/B;->i:I

    const/4 v3, 0x3

    invoke-virtual {p1, v2, v3, v1}, Lcom/tencent/bugly/proguard/k;->a(IIZ)I

    move-result v2

    iput v2, p0, Lcom/tencent/bugly/proguard/B;->i:I

    .line 26
    sget-object v2, Lcom/tencent/bugly/proguard/B;->a:Lcom/tencent/bugly/proguard/y;

    if-nez v2, :cond_0

    .line 27
    new-instance v2, Lcom/tencent/bugly/proguard/y;

    invoke-direct {v2}, Lcom/tencent/bugly/proguard/y;-><init>()V

    sput-object v2, Lcom/tencent/bugly/proguard/B;->a:Lcom/tencent/bugly/proguard/y;

    .line 28
    :cond_0
    sget-object v2, Lcom/tencent/bugly/proguard/B;->a:Lcom/tencent/bugly/proguard/y;

    const/4 v3, 0x4

    invoke-virtual {p1, v2, v3, v1}, Lcom/tencent/bugly/proguard/k;->a(Lcom/tencent/bugly/proguard/m;IZ)Lcom/tencent/bugly/proguard/m;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/proguard/y;

    iput-object v2, p0, Lcom/tencent/bugly/proguard/B;->j:Lcom/tencent/bugly/proguard/y;

    .line 29
    sget-object v2, Lcom/tencent/bugly/proguard/B;->b:Lcom/tencent/bugly/proguard/x;

    if-nez v2, :cond_1

    .line 30
    new-instance v2, Lcom/tencent/bugly/proguard/x;

    invoke-direct {v2}, Lcom/tencent/bugly/proguard/x;-><init>()V

    sput-object v2, Lcom/tencent/bugly/proguard/B;->b:Lcom/tencent/bugly/proguard/x;

    .line 31
    :cond_1
    sget-object v2, Lcom/tencent/bugly/proguard/B;->b:Lcom/tencent/bugly/proguard/x;

    const/4 v3, 0x5

    invoke-virtual {p1, v2, v3, v1}, Lcom/tencent/bugly/proguard/k;->a(Lcom/tencent/bugly/proguard/m;IZ)Lcom/tencent/bugly/proguard/m;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/proguard/x;

    iput-object v2, p0, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    .line 32
    iget-byte v2, p0, Lcom/tencent/bugly/proguard/B;->l:B

    const/4 v3, 0x6

    invoke-virtual {p1, v2, v3, v1}, Lcom/tencent/bugly/proguard/k;->a(BIZ)B

    move-result v1

    iput-byte v1, p0, Lcom/tencent/bugly/proguard/B;->l:B

    .line 33
    iget v1, p0, Lcom/tencent/bugly/proguard/B;->m:I

    const/4 v2, 0x7

    invoke-virtual {p1, v1, v2, v0}, Lcom/tencent/bugly/proguard/k;->a(IIZ)I

    move-result v1

    iput v1, p0, Lcom/tencent/bugly/proguard/B;->m:I

    .line 34
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/B;->n:J

    const/16 v3, 0x8

    invoke-virtual {p1, v1, v2, v3, v0}, Lcom/tencent/bugly/proguard/k;->a(JIZ)J

    move-result-wide v1

    iput-wide v1, p0, Lcom/tencent/bugly/proguard/B;->n:J

    .line 35
    sget-object v1, Lcom/tencent/bugly/proguard/B;->c:Lcom/tencent/bugly/proguard/x;

    if-nez v1, :cond_2

    .line 36
    new-instance v1, Lcom/tencent/bugly/proguard/x;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/x;-><init>()V

    sput-object v1, Lcom/tencent/bugly/proguard/B;->c:Lcom/tencent/bugly/proguard/x;

    .line 37
    :cond_2
    sget-object v1, Lcom/tencent/bugly/proguard/B;->c:Lcom/tencent/bugly/proguard/x;

    const/16 v2, 0x9

    invoke-virtual {p1, v1, v2, v0}, Lcom/tencent/bugly/proguard/k;->a(Lcom/tencent/bugly/proguard/m;IZ)Lcom/tencent/bugly/proguard/m;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/proguard/x;

    iput-object v1, p0, Lcom/tencent/bugly/proguard/B;->o:Lcom/tencent/bugly/proguard/x;

    const/16 v1, 0xa

    .line 38
    invoke-virtual {p1, v1, v0}, Lcom/tencent/bugly/proguard/k;->a(IZ)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/tencent/bugly/proguard/B;->p:Ljava/lang/String;

    .line 39
    sget-object v1, Lcom/tencent/bugly/proguard/B;->d:Ljava/util/Map;

    if-nez v1, :cond_3

    .line 40
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    sput-object v1, Lcom/tencent/bugly/proguard/B;->d:Ljava/util/Map;

    .line 41
    const-string v2, ""

    invoke-interface {v1, v2, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    :cond_3
    sget-object v1, Lcom/tencent/bugly/proguard/B;->d:Ljava/util/Map;

    const/16 v2, 0xb

    invoke-virtual {p1, v1, v2, v0}, Lcom/tencent/bugly/proguard/k;->a(Ljava/lang/Object;IZ)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    iput-object v1, p0, Lcom/tencent/bugly/proguard/B;->q:Ljava/util/Map;

    const/16 v1, 0xc

    .line 43
    invoke-virtual {p1, v1, v0}, Lcom/tencent/bugly/proguard/k;->a(IZ)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    .line 44
    iget v1, p0, Lcom/tencent/bugly/proguard/B;->s:I

    const/16 v2, 0xd

    invoke-virtual {p1, v1, v2, v0}, Lcom/tencent/bugly/proguard/k;->a(IIZ)I

    move-result v1

    iput v1, p0, Lcom/tencent/bugly/proguard/B;->s:I

    .line 45
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/B;->t:J

    const/16 v3, 0xe

    invoke-virtual {p1, v1, v2, v3, v0}, Lcom/tencent/bugly/proguard/k;->a(JIZ)J

    move-result-wide v1

    iput-wide v1, p0, Lcom/tencent/bugly/proguard/B;->t:J

    .line 46
    iget v1, p0, Lcom/tencent/bugly/proguard/B;->u:I

    const/16 v2, 0xf

    invoke-virtual {p1, v1, v2, v0}, Lcom/tencent/bugly/proguard/k;->a(IIZ)I

    move-result p1

    iput p1, p0, Lcom/tencent/bugly/proguard/B;->u:I

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/l;)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/B;->f:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/l;->a(Ljava/lang/String;I)V

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/B;->g:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/l;->a(Ljava/lang/String;I)V

    .line 4
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/B;->h:J

    const/4 v2, 0x2

    invoke-virtual {p1, v0, v1, v2}, Lcom/tencent/bugly/proguard/l;->a(JI)V

    .line 5
    iget v0, p0, Lcom/tencent/bugly/proguard/B;->i:I

    const/4 v1, 0x3

    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/l;->a(II)V

    .line 6
    iget-object v0, p0, Lcom/tencent/bugly/proguard/B;->j:Lcom/tencent/bugly/proguard/y;

    const/4 v1, 0x4

    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/l;->a(Lcom/tencent/bugly/proguard/m;I)V

    .line 7
    iget-object v0, p0, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    const/4 v1, 0x5

    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/l;->a(Lcom/tencent/bugly/proguard/m;I)V

    .line 8
    iget-byte v0, p0, Lcom/tencent/bugly/proguard/B;->l:B

    const/4 v1, 0x6

    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/l;->a(BI)V

    .line 9
    iget v0, p0, Lcom/tencent/bugly/proguard/B;->m:I

    const/4 v1, 0x7

    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/l;->a(II)V

    .line 10
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/B;->n:J

    const/16 v2, 0x8

    invoke-virtual {p1, v0, v1, v2}, Lcom/tencent/bugly/proguard/l;->a(JI)V

    .line 11
    iget-object v0, p0, Lcom/tencent/bugly/proguard/B;->o:Lcom/tencent/bugly/proguard/x;

    if-eqz v0, :cond_0

    const/16 v1, 0x9

    .line 12
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/l;->a(Lcom/tencent/bugly/proguard/m;I)V

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/B;->p:Ljava/lang/String;

    if-eqz v0, :cond_1

    const/16 v1, 0xa

    .line 14
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/l;->a(Ljava/lang/String;I)V

    .line 15
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/B;->q:Ljava/util/Map;

    if-eqz v0, :cond_2

    const/16 v1, 0xb

    .line 16
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/l;->a(Ljava/util/Map;I)V

    .line 17
    :cond_2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    if-eqz v0, :cond_3

    const/16 v1, 0xc

    .line 18
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/l;->a(Ljava/lang/String;I)V

    .line 19
    :cond_3
    iget v0, p0, Lcom/tencent/bugly/proguard/B;->s:I

    const/16 v1, 0xd

    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/l;->a(II)V

    .line 20
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/B;->t:J

    const/16 v2, 0xe

    invoke-virtual {p1, v0, v1, v2}, Lcom/tencent/bugly/proguard/l;->a(JI)V

    .line 21
    iget v0, p0, Lcom/tencent/bugly/proguard/B;->u:I

    const/16 v1, 0xf

    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/l;->a(II)V

    return-void
.end method

.method public a(Ljava/lang/StringBuilder;I)V
    .locals 2

    .line 47
    new-instance v0, Lcom/tencent/bugly/proguard/i;

    invoke-direct {v0, p1, p2}, Lcom/tencent/bugly/proguard/i;-><init>(Ljava/lang/StringBuilder;I)V

    .line 48
    iget-object p1, p0, Lcom/tencent/bugly/proguard/B;->f:Ljava/lang/String;

    const-string p2, "title"

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/i;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/bugly/proguard/i;

    .line 49
    iget-object p1, p0, Lcom/tencent/bugly/proguard/B;->g:Ljava/lang/String;

    const-string p2, "newFeature"

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/i;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/bugly/proguard/i;

    .line 50
    iget-wide p1, p0, Lcom/tencent/bugly/proguard/B;->h:J

    const-string v1, "publishTime"

    invoke-virtual {v0, p1, p2, v1}, Lcom/tencent/bugly/proguard/i;->a(JLjava/lang/String;)Lcom/tencent/bugly/proguard/i;

    .line 51
    iget p1, p0, Lcom/tencent/bugly/proguard/B;->i:I

    const-string p2, "publishType"

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/i;->a(ILjava/lang/String;)Lcom/tencent/bugly/proguard/i;

    .line 52
    iget-object p1, p0, Lcom/tencent/bugly/proguard/B;->j:Lcom/tencent/bugly/proguard/y;

    const-string p2, "appBasicInfo"

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/i;->a(Lcom/tencent/bugly/proguard/m;Ljava/lang/String;)Lcom/tencent/bugly/proguard/i;

    .line 53
    iget-object p1, p0, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    const-string p2, "apkBaseInfo"

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/i;->a(Lcom/tencent/bugly/proguard/m;Ljava/lang/String;)Lcom/tencent/bugly/proguard/i;

    .line 54
    iget-byte p1, p0, Lcom/tencent/bugly/proguard/B;->l:B

    const-string p2, "updateStrategy"

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/i;->a(BLjava/lang/String;)Lcom/tencent/bugly/proguard/i;

    .line 55
    iget p1, p0, Lcom/tencent/bugly/proguard/B;->m:I

    const-string p2, "popTimes"

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/i;->a(ILjava/lang/String;)Lcom/tencent/bugly/proguard/i;

    .line 56
    iget-wide p1, p0, Lcom/tencent/bugly/proguard/B;->n:J

    const-string v1, "popInterval"

    invoke-virtual {v0, p1, p2, v1}, Lcom/tencent/bugly/proguard/i;->a(JLjava/lang/String;)Lcom/tencent/bugly/proguard/i;

    .line 57
    iget-object p1, p0, Lcom/tencent/bugly/proguard/B;->o:Lcom/tencent/bugly/proguard/x;

    const-string p2, "diffApkInfo"

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/i;->a(Lcom/tencent/bugly/proguard/m;Ljava/lang/String;)Lcom/tencent/bugly/proguard/i;

    .line 58
    iget-object p1, p0, Lcom/tencent/bugly/proguard/B;->p:Ljava/lang/String;

    const-string p2, "netType"

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/i;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/bugly/proguard/i;

    .line 59
    iget-object p1, p0, Lcom/tencent/bugly/proguard/B;->q:Ljava/util/Map;

    const-string p2, "reserved"

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/i;->a(Ljava/util/Map;Ljava/lang/String;)Lcom/tencent/bugly/proguard/i;

    .line 60
    iget-object p1, p0, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    const-string p2, "strategyId"

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/i;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/bugly/proguard/i;

    .line 61
    iget p1, p0, Lcom/tencent/bugly/proguard/B;->s:I

    const-string p2, "status"

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/i;->a(ILjava/lang/String;)Lcom/tencent/bugly/proguard/i;

    .line 62
    iget-wide p1, p0, Lcom/tencent/bugly/proguard/B;->t:J

    const-string v1, "updateTime"

    invoke-virtual {v0, p1, p2, v1}, Lcom/tencent/bugly/proguard/i;->a(JLjava/lang/String;)Lcom/tencent/bugly/proguard/i;

    .line 63
    iget p1, p0, Lcom/tencent/bugly/proguard/B;->u:I

    const-string p2, "updateType"

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/i;->a(ILjava/lang/String;)Lcom/tencent/bugly/proguard/i;

    return-void
.end method

.method public b()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/B;->h:J

    .line 2
    .line 3
    return-wide v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public c()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/B;->q:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public clone()Ljava/lang/Object;
    .locals 1

    .line 1
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object v0

    .line 6
    :catch_0
    sget-boolean v0, Lcom/tencent/bugly/proguard/B;->e:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 15
    .line 16
    .line 17
    throw v0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    check-cast p1, Lcom/tencent/bugly/proguard/B;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/tencent/bugly/proguard/B;->f:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p1, Lcom/tencent/bugly/proguard/B;->f:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v1, v2}, Lcom/tencent/bugly/proguard/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iget-object v1, p0, Lcom/tencent/bugly/proguard/B;->g:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v2, p1, Lcom/tencent/bugly/proguard/B;->g:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v1, v2}, Lcom/tencent/bugly/proguard/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/B;->h:J

    .line 28
    .line 29
    iget-wide v3, p1, Lcom/tencent/bugly/proguard/B;->h:J

    .line 30
    .line 31
    invoke-static {v1, v2, v3, v4}, Lcom/tencent/bugly/proguard/n;->a(JJ)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    iget v1, p0, Lcom/tencent/bugly/proguard/B;->i:I

    .line 38
    .line 39
    iget v2, p1, Lcom/tencent/bugly/proguard/B;->i:I

    .line 40
    .line 41
    invoke-static {v1, v2}, Lcom/tencent/bugly/proguard/n;->a(II)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    iget-object v1, p0, Lcom/tencent/bugly/proguard/B;->j:Lcom/tencent/bugly/proguard/y;

    .line 48
    .line 49
    iget-object v2, p1, Lcom/tencent/bugly/proguard/B;->j:Lcom/tencent/bugly/proguard/y;

    .line 50
    .line 51
    invoke-static {v1, v2}, Lcom/tencent/bugly/proguard/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_1

    .line 56
    .line 57
    iget-object v1, p0, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    .line 58
    .line 59
    iget-object v2, p1, Lcom/tencent/bugly/proguard/B;->k:Lcom/tencent/bugly/proguard/x;

    .line 60
    .line 61
    invoke-static {v1, v2}, Lcom/tencent/bugly/proguard/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_1

    .line 66
    .line 67
    iget-byte v1, p0, Lcom/tencent/bugly/proguard/B;->l:B

    .line 68
    .line 69
    iget-byte v2, p1, Lcom/tencent/bugly/proguard/B;->l:B

    .line 70
    .line 71
    invoke-static {v1, v2}, Lcom/tencent/bugly/proguard/n;->a(BB)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_1

    .line 76
    .line 77
    iget v1, p0, Lcom/tencent/bugly/proguard/B;->m:I

    .line 78
    .line 79
    iget v2, p1, Lcom/tencent/bugly/proguard/B;->m:I

    .line 80
    .line 81
    invoke-static {v1, v2}, Lcom/tencent/bugly/proguard/n;->a(II)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_1

    .line 86
    .line 87
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/B;->n:J

    .line 88
    .line 89
    iget-wide v3, p1, Lcom/tencent/bugly/proguard/B;->n:J

    .line 90
    .line 91
    invoke-static {v1, v2, v3, v4}, Lcom/tencent/bugly/proguard/n;->a(JJ)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_1

    .line 96
    .line 97
    iget-object v1, p0, Lcom/tencent/bugly/proguard/B;->o:Lcom/tencent/bugly/proguard/x;

    .line 98
    .line 99
    iget-object v2, p1, Lcom/tencent/bugly/proguard/B;->o:Lcom/tencent/bugly/proguard/x;

    .line 100
    .line 101
    invoke-static {v1, v2}, Lcom/tencent/bugly/proguard/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-eqz v1, :cond_1

    .line 106
    .line 107
    iget-object v1, p0, Lcom/tencent/bugly/proguard/B;->p:Ljava/lang/String;

    .line 108
    .line 109
    iget-object v2, p1, Lcom/tencent/bugly/proguard/B;->p:Ljava/lang/String;

    .line 110
    .line 111
    invoke-static {v1, v2}, Lcom/tencent/bugly/proguard/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-eqz v1, :cond_1

    .line 116
    .line 117
    iget-object v1, p0, Lcom/tencent/bugly/proguard/B;->q:Ljava/util/Map;

    .line 118
    .line 119
    iget-object v2, p1, Lcom/tencent/bugly/proguard/B;->q:Ljava/util/Map;

    .line 120
    .line 121
    invoke-static {v1, v2}, Lcom/tencent/bugly/proguard/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-eqz v1, :cond_1

    .line 126
    .line 127
    iget-object v1, p0, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    .line 128
    .line 129
    iget-object v2, p1, Lcom/tencent/bugly/proguard/B;->r:Ljava/lang/String;

    .line 130
    .line 131
    invoke-static {v1, v2}, Lcom/tencent/bugly/proguard/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_1

    .line 136
    .line 137
    iget v1, p0, Lcom/tencent/bugly/proguard/B;->s:I

    .line 138
    .line 139
    iget v2, p1, Lcom/tencent/bugly/proguard/B;->s:I

    .line 140
    .line 141
    invoke-static {v1, v2}, Lcom/tencent/bugly/proguard/n;->a(II)Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-eqz v1, :cond_1

    .line 146
    .line 147
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/B;->t:J

    .line 148
    .line 149
    iget-wide v3, p1, Lcom/tencent/bugly/proguard/B;->t:J

    .line 150
    .line 151
    invoke-static {v1, v2, v3, v4}, Lcom/tencent/bugly/proguard/n;->a(JJ)Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-eqz v1, :cond_1

    .line 156
    .line 157
    iget v1, p0, Lcom/tencent/bugly/proguard/B;->u:I

    .line 158
    .line 159
    iget p1, p1, Lcom/tencent/bugly/proguard/B;->u:I

    .line 160
    .line 161
    invoke-static {v1, p1}, Lcom/tencent/bugly/proguard/n;->a(II)Z

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    if-eqz p1, :cond_1

    .line 166
    .line 167
    const/4 p1, 0x1

    .line 168
    return p1

    .line 169
    :cond_1
    return v0
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method

.method public hashCode()I
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Ljava/lang/Exception;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    const-string v1, "Need define key first!"

    .line 4
    .line 5
    :try_start_1
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 9
    :catch_0
    move-exception v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method
