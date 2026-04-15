.class public abstract Lg9/a;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Lef/l;

.field public static final b:Lef/l;

.field public static final c:Lub/p;

.field public static final d:Lub/p;

.field public static final e:Ljava/util/List;

.field public static final f:Lub/p;

.field public static final g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lef/l;

    .line 2
    .line 3
    const-string v1, "https?://(?:.*asmr\\.one)|(?:.*asmr-[123]00\\.com)/work/RJ(\\d+)"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lef/l;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lg9/a;->a:Lef/l;

    .line 9
    .line 10
    new-instance v0, Lef/l;

    .line 11
    .line 12
    const-string v1, "https?://.*dlsite.com/\\w+/work/=/product_id/RJ(\\d+).html"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lef/l;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lg9/a;->b:Lef/l;

    .line 18
    .line 19
    new-instance v0, Le/e;

    .line 20
    .line 21
    const/16 v1, 0x10

    .line 22
    .line 23
    invoke-direct {v0, v1}, Le/e;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lub/a;->d(Lic/a;)Lub/p;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Lg9/a;->c:Lub/p;

    .line 31
    .line 32
    new-instance v0, Le/e;

    .line 33
    .line 34
    const/16 v1, 0x11

    .line 35
    .line 36
    invoke-direct {v0, v1}, Le/e;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Lub/a;->d(Lic/a;)Lub/p;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, Lg9/a;->d:Lub/p;

    .line 44
    .line 45
    const-string v0, "https://api.asmr.one"

    .line 46
    .line 47
    const-string v1, "https://api.asmr-100.com"

    .line 48
    .line 49
    const-string v2, "https://api.asmr-200.com"

    .line 50
    .line 51
    const-string v3, "https://api.asmr-300.com"

    .line 52
    .line 53
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, Lud/b;->x([Ljava/lang/Object;)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    sput-object v0, Lg9/a;->e:Ljava/util/List;

    .line 62
    .line 63
    new-instance v0, Le/e;

    .line 64
    .line 65
    const/16 v1, 0x12

    .line 66
    .line 67
    invoke-direct {v0, v1}, Le/e;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-static {v0}, Lub/a;->d(Lic/a;)Lub/p;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    sput-object v0, Lg9/a;->f:Lub/p;

    .line 75
    .line 76
    const-string v0, "kikoeru android app 3.0.9(67)"

    .line 77
    .line 78
    sput-object v0, Lg9/a;->g:Ljava/lang/String;

    .line 79
    .line 80
    return-void
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
.end method

.method public static a()Lfg/f;
    .locals 1

    .line 1
    sget-object v0, Lg9/a;->c:Lub/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lub/p;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lfg/f;

    .line 8
    .line 9
    return-object v0
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

.method public static b()Z
    .locals 2

    .line 1
    invoke-static {}, Lg9/a;->a()Lfg/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lfg/f;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lg9/a;->e:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
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

.method public static c()Z
    .locals 1

    .line 1
    sget-object v0, Lg9/a;->f:Lub/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lub/p;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
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

.method public static d(J)V
    .locals 2

    .line 1
    const-string v0, "https://www.asmr-300.com/work/"

    .line 2
    .line 3
    invoke-static {p0, p1, v0}, Lj2/h0;->i(JLjava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {}, La9/i;->a()Lcom/cnl/kikoeru/MainApplication;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string v0, "text"

    .line 12
    .line 13
    invoke-static {p0, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "ctx"

    .line 17
    .line 18
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Landroid/content/Intent;

    .line 22
    .line 23
    const-string v1, "android.intent.action.SEND"

    .line 24
    .line 25
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v1, "android.intent.extra.TEXT"

    .line 29
    .line 30
    invoke-virtual {v0, v1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 31
    .line 32
    .line 33
    const/high16 p0, 0x10000000

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 36
    .line 37
    .line 38
    const-string v1, "text/plain"

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 41
    .line 42
    .line 43
    const v1, 0x7f0c003a

    .line 44
    .line 45
    .line 46
    invoke-static {v1}, Lna/q;->g(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-static {v0, v1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0, p0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 58
    .line 59
    .line 60
    return-void
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method
