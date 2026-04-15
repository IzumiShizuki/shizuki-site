.class public final Lcom/tencent/bugly/proguard/s;
.super Ljava/lang/Thread;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:I

.field public final b:Lcom/tencent/bugly/proguard/I;

.field public c:Ljava/lang/String;

.field public d:Landroid/content/ContentValues;

.field public e:Z

.field public f:[Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:[Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;

.field public m:Ljava/lang/String;

.field public n:[Ljava/lang/String;

.field public o:I

.field public p:Ljava/lang/String;

.field public q:[B

.field public final synthetic r:Lcom/tencent/bugly/proguard/J;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/J;ILcom/tencent/bugly/proguard/I;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/bugly/proguard/s;->r:Lcom/tencent/bugly/proguard/J;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 4
    .line 5
    .line 6
    iput p2, p0, Lcom/tencent/bugly/proguard/s;->a:I

    .line 7
    .line 8
    iput-object p3, p0, Lcom/tencent/bugly/proguard/s;->b:Lcom/tencent/bugly/proguard/I;

    .line 9
    .line 10
    return-void
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 1
    iget v0, p0, Lcom/tencent/bugly/proguard/s;->a:I

    .line 2
    .line 3
    iget-object v11, p0, Lcom/tencent/bugly/proguard/s;->b:Lcom/tencent/bugly/proguard/I;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/tencent/bugly/proguard/s;->r:Lcom/tencent/bugly/proguard/J;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :pswitch_0
    iget v0, p0, Lcom/tencent/bugly/proguard/s;->o:I

    .line 12
    .line 13
    iget-object v2, p0, Lcom/tencent/bugly/proguard/s;->p:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v1, v0, v2, v11}, Lcom/tencent/bugly/proguard/J;->a(Lcom/tencent/bugly/proguard/J;ILjava/lang/String;Lcom/tencent/bugly/proguard/I;)Z

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_1
    iget v0, p0, Lcom/tencent/bugly/proguard/s;->o:I

    .line 20
    .line 21
    invoke-static {v1, v0, v11}, Lcom/tencent/bugly/proguard/J;->a(Lcom/tencent/bugly/proguard/J;ILcom/tencent/bugly/proguard/I;)Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_2
    iget v0, p0, Lcom/tencent/bugly/proguard/s;->o:I

    .line 26
    .line 27
    iget-object v2, p0, Lcom/tencent/bugly/proguard/s;->p:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v3, p0, Lcom/tencent/bugly/proguard/s;->q:[B

    .line 30
    .line 31
    invoke-static {v1, v0, v2, v3, v11}, Lcom/tencent/bugly/proguard/J;->a(Lcom/tencent/bugly/proguard/J;ILjava/lang/String;[BLcom/tencent/bugly/proguard/I;)Z

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_3
    iget-boolean v2, p0, Lcom/tencent/bugly/proguard/s;->e:Z

    .line 36
    .line 37
    iget-object v3, p0, Lcom/tencent/bugly/proguard/s;->c:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v4, p0, Lcom/tencent/bugly/proguard/s;->f:[Ljava/lang/String;

    .line 40
    .line 41
    iget-object v5, p0, Lcom/tencent/bugly/proguard/s;->g:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v6, p0, Lcom/tencent/bugly/proguard/s;->h:[Ljava/lang/String;

    .line 44
    .line 45
    iget-object v7, p0, Lcom/tencent/bugly/proguard/s;->i:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v8, p0, Lcom/tencent/bugly/proguard/s;->j:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v9, p0, Lcom/tencent/bugly/proguard/s;->k:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v10, p0, Lcom/tencent/bugly/proguard/s;->l:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static/range {v1 .. v11}, Lcom/tencent/bugly/proguard/J;->a(Lcom/tencent/bugly/proguard/J;ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/proguard/I;)Landroid/database/Cursor;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-eqz v0, :cond_0

    .line 58
    .line 59
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 60
    .line 61
    .line 62
    :cond_0
    :goto_0
    return-void

    .line 63
    :pswitch_4
    iget-object v0, p0, Lcom/tencent/bugly/proguard/s;->c:Ljava/lang/String;

    .line 64
    .line 65
    iget-object v2, p0, Lcom/tencent/bugly/proguard/s;->m:Ljava/lang/String;

    .line 66
    .line 67
    iget-object v3, p0, Lcom/tencent/bugly/proguard/s;->n:[Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v1, v0, v2, v3, v11}, Lcom/tencent/bugly/proguard/J;->a(Lcom/tencent/bugly/proguard/J;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lcom/tencent/bugly/proguard/I;)I

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/s;->c:Ljava/lang/String;

    .line 74
    .line 75
    iget-object v2, p0, Lcom/tencent/bugly/proguard/s;->d:Landroid/content/ContentValues;

    .line 76
    .line 77
    invoke-static {v1, v0, v2, v11}, Lcom/tencent/bugly/proguard/J;->a(Lcom/tencent/bugly/proguard/J;Ljava/lang/String;Landroid/content/ContentValues;Lcom/tencent/bugly/proguard/I;)J

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
