.class public final Lr5/p;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lr5/q;
.implements Lr8/e;
.implements Ln5/q;


# static fields
.field public static b:Z

.field public static c:Ljava/lang/reflect/Constructor;


# instance fields
.field public final synthetic a:I


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v0, 0xd

    iput v0, p0, Lr5/p;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Lo/u;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lo/u;-><init>(I)V

    .line 5
    sget-object v0, Lo/s0;->a:[J

    .line 6
    new-instance v0, Lo/k0;

    invoke-direct {v0}, Lo/k0;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lr5/p;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 2
    iput p2, p0, Lr5/p;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Ljava/lang/String;Lx2/k;I)Landroid/graphics/Typeface;
    .locals 2

    .line 1
    if-nez p2, :cond_1

    .line 2
    .line 3
    sget-object v0, Lx2/k;->d:Lx2/k;

    .line 4
    .line 5
    invoke-static {p1, v0}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    :cond_0
    sget-object p0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_1
    const/4 v0, 0x0

    .line 23
    if-nez p0, :cond_2

    .line 24
    .line 25
    sget-object p0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    invoke-static {p0, v0}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    :goto_0
    iget p1, p1, Lx2/k;->a:I

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    if-ne p2, v1, :cond_3

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    :cond_3
    invoke-static {p0, p1, v0}, Lb5/z;->d(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
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

.method public static d(Ljava/lang/String;Lx2/k;I)Landroid/graphics/Typeface;
    .locals 1

    .line 1
    if-nez p2, :cond_1

    .line 2
    .line 3
    sget-object v0, Lx2/k;->d:Lx2/k;

    .line 4
    .line 5
    invoke-static {p1, v0}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    :cond_0
    sget-object p0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_1
    invoke-static {p1, p2}, Lud/b;->p(Lx2/k;I)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p0, :cond_3

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-nez p2, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-static {p0, p1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :cond_3
    :goto_0
    invoke-static {p1}, Landroid/graphics/Typeface;->defaultFromStyle(I)Landroid/graphics/Typeface;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
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

.method private final f()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method private final h(Lr5/b0;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method


# virtual methods
.method public F0(Landroid/net/Uri;Ls4/k;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance p1, Ljava/io/BufferedReader;

    .line 2
    .line 3
    new-instance v0, Ljava/io/InputStreamReader;

    .line 4
    .line 5
    invoke-direct {v0, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p1, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Lp4/c0;->Q(Ljava/lang/String;)J

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
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
.end method

.method public a(Lr5/b0;)V
    .locals 0

    .line 1
    iget p1, p0, Lr5/p;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 10
    .line 11
    .line 12
    throw p1

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method

.method public b(Lu2/h;)Landroid/text/StaticLayout;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lr5/p;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    const-string v2, "unable to call constructor"

    .line 11
    .line 12
    sget-boolean v3, Lr5/p;->b:Z

    .line 13
    .line 14
    const/16 v6, 0xa

    .line 15
    .line 16
    const/16 v7, 0x9

    .line 17
    .line 18
    const/16 v8, 0x8

    .line 19
    .line 20
    const/4 v9, 0x7

    .line 21
    const/4 v10, 0x6

    .line 22
    const/4 v11, 0x5

    .line 23
    const/4 v12, 0x4

    .line 24
    const/4 v13, 0x3

    .line 25
    const/4 v14, 0x2

    .line 26
    const/16 v15, 0xd

    .line 27
    .line 28
    const/16 v16, 0x0

    .line 29
    .line 30
    const/16 v17, 0x1

    .line 31
    .line 32
    const/16 v18, 0xc

    .line 33
    .line 34
    const-string v4, "StaticLayoutFactory"

    .line 35
    .line 36
    const/16 v19, 0x0

    .line 37
    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    sget-object v3, Lr5/p;->c:Ljava/lang/reflect/Constructor;

    .line 41
    .line 42
    const/16 v20, 0xb

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    sput-boolean v17, Lr5/p;->b:Z

    .line 46
    .line 47
    :try_start_0
    const-class v3, Landroid/text/StaticLayout;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    const/16 v20, 0xb

    .line 50
    .line 51
    :try_start_1
    new-array v5, v15, [Ljava/lang/Class;

    .line 52
    .line 53
    const-class v21, Ljava/lang/CharSequence;

    .line 54
    .line 55
    aput-object v21, v5, v16

    .line 56
    .line 57
    sget-object v21, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 58
    .line 59
    aput-object v21, v5, v17

    .line 60
    .line 61
    aput-object v21, v5, v14

    .line 62
    .line 63
    const-class v22, Landroid/text/TextPaint;

    .line 64
    .line 65
    aput-object v22, v5, v13

    .line 66
    .line 67
    aput-object v21, v5, v12

    .line 68
    .line 69
    const-class v22, Landroid/text/Layout$Alignment;

    .line 70
    .line 71
    aput-object v22, v5, v11

    .line 72
    .line 73
    const-class v22, Landroid/text/TextDirectionHeuristic;

    .line 74
    .line 75
    aput-object v22, v5, v10

    .line 76
    .line 77
    sget-object v22, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 78
    .line 79
    aput-object v22, v5, v9

    .line 80
    .line 81
    aput-object v22, v5, v8

    .line 82
    .line 83
    sget-object v22, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 84
    .line 85
    aput-object v22, v5, v7

    .line 86
    .line 87
    const-class v22, Landroid/text/TextUtils$TruncateAt;

    .line 88
    .line 89
    aput-object v22, v5, v6

    .line 90
    .line 91
    aput-object v21, v5, v20

    .line 92
    .line 93
    aput-object v21, v5, v18

    .line 94
    .line 95
    invoke-virtual {v3, v5}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    sput-object v3, Lr5/p;->c:Ljava/lang/reflect/Constructor;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :catch_0
    const/16 v20, 0xb

    .line 103
    .line 104
    :catch_1
    sput-object v19, Lr5/p;->c:Ljava/lang/reflect/Constructor;

    .line 105
    .line 106
    const-string v3, "unable to collect necessary constructor."

    .line 107
    .line 108
    invoke-static {v4, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    :goto_0
    sget-object v3, Lr5/p;->c:Ljava/lang/reflect/Constructor;

    .line 112
    .line 113
    :goto_1
    if-eqz v3, :cond_1

    .line 114
    .line 115
    :try_start_2
    iget-object v5, v1, Lu2/h;->a:Ljava/lang/CharSequence;

    .line 116
    .line 117
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object v21

    .line 121
    const/16 v22, 0xa

    .line 122
    .line 123
    iget v6, v1, Lu2/h;->b:I

    .line 124
    .line 125
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    const/16 v23, 0x9

    .line 130
    .line 131
    iget-object v7, v1, Lu2/h;->c:Landroid/text/TextPaint;

    .line 132
    .line 133
    const/16 v24, 0x8

    .line 134
    .line 135
    iget v8, v1, Lu2/h;->d:I

    .line 136
    .line 137
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    const/16 v25, 0x7

    .line 142
    .line 143
    iget-object v9, v1, Lu2/h;->f:Landroid/text/Layout$Alignment;

    .line 144
    .line 145
    const/16 v26, 0x6

    .line 146
    .line 147
    iget-object v10, v1, Lu2/h;->e:Landroid/text/TextDirectionHeuristic;

    .line 148
    .line 149
    const/high16 v27, 0x3f800000    # 1.0f

    .line 150
    .line 151
    invoke-static/range {v27 .. v27}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 152
    .line 153
    .line 154
    move-result-object v27

    .line 155
    const/16 v28, 0x0

    .line 156
    .line 157
    invoke-static/range {v28 .. v28}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 158
    .line 159
    .line 160
    move-result-object v28

    .line 161
    const/16 v29, 0x5

    .line 162
    .line 163
    iget-boolean v11, v1, Lu2/h;->k:Z

    .line 164
    .line 165
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 166
    .line 167
    .line 168
    move-result-object v11

    .line 169
    const/16 v30, 0x4

    .line 170
    .line 171
    iget-object v12, v1, Lu2/h;->h:Landroid/text/TextUtils$TruncateAt;

    .line 172
    .line 173
    const/16 v31, 0x3

    .line 174
    .line 175
    iget v13, v1, Lu2/h;->i:I

    .line 176
    .line 177
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 178
    .line 179
    .line 180
    move-result-object v13

    .line 181
    const/16 v32, 0x2

    .line 182
    .line 183
    iget v14, v1, Lu2/h;->g:I

    .line 184
    .line 185
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 186
    .line 187
    .line 188
    move-result-object v14

    .line 189
    new-array v15, v15, [Ljava/lang/Object;

    .line 190
    .line 191
    aput-object v5, v15, v16

    .line 192
    .line 193
    aput-object v21, v15, v17

    .line 194
    .line 195
    aput-object v6, v15, v32

    .line 196
    .line 197
    aput-object v7, v15, v31

    .line 198
    .line 199
    aput-object v8, v15, v30

    .line 200
    .line 201
    aput-object v9, v15, v29

    .line 202
    .line 203
    aput-object v10, v15, v26

    .line 204
    .line 205
    aput-object v27, v15, v25

    .line 206
    .line 207
    aput-object v28, v15, v24

    .line 208
    .line 209
    aput-object v11, v15, v23

    .line 210
    .line 211
    aput-object v12, v15, v22

    .line 212
    .line 213
    aput-object v13, v15, v20

    .line 214
    .line 215
    aput-object v14, v15, v18

    .line 216
    .line 217
    invoke-virtual {v3, v15}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    check-cast v3, Landroid/text/StaticLayout;
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/InstantiationException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_2

    .line 222
    .line 223
    move-object/from16 v19, v3

    .line 224
    .line 225
    goto :goto_2

    .line 226
    :catch_2
    sput-object v19, Lr5/p;->c:Ljava/lang/reflect/Constructor;

    .line 227
    .line 228
    invoke-static {v4, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 229
    .line 230
    .line 231
    goto :goto_2

    .line 232
    :catch_3
    sput-object v19, Lr5/p;->c:Ljava/lang/reflect/Constructor;

    .line 233
    .line 234
    invoke-static {v4, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 235
    .line 236
    .line 237
    goto :goto_2

    .line 238
    :catch_4
    sput-object v19, Lr5/p;->c:Ljava/lang/reflect/Constructor;

    .line 239
    .line 240
    invoke-static {v4, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 241
    .line 242
    .line 243
    :cond_1
    :goto_2
    if-eqz v19, :cond_2

    .line 244
    .line 245
    goto :goto_3

    .line 246
    :cond_2
    new-instance v2, Landroid/text/StaticLayout;

    .line 247
    .line 248
    move-object v3, v2

    .line 249
    iget-object v2, v1, Lu2/h;->a:Ljava/lang/CharSequence;

    .line 250
    .line 251
    iget v4, v1, Lu2/h;->b:I

    .line 252
    .line 253
    iget-object v5, v1, Lu2/h;->c:Landroid/text/TextPaint;

    .line 254
    .line 255
    iget v6, v1, Lu2/h;->d:I

    .line 256
    .line 257
    iget-object v7, v1, Lu2/h;->f:Landroid/text/Layout$Alignment;

    .line 258
    .line 259
    iget-boolean v10, v1, Lu2/h;->k:Z

    .line 260
    .line 261
    iget-object v11, v1, Lu2/h;->h:Landroid/text/TextUtils$TruncateAt;

    .line 262
    .line 263
    iget v12, v1, Lu2/h;->i:I

    .line 264
    .line 265
    move-object v1, v3

    .line 266
    const/4 v3, 0x0

    .line 267
    const/high16 v8, 0x3f800000    # 1.0f

    .line 268
    .line 269
    const/4 v9, 0x0

    .line 270
    invoke-direct/range {v1 .. v12}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;IILandroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZLandroid/text/TextUtils$TruncateAt;I)V

    .line 271
    .line 272
    .line 273
    move-object/from16 v19, v1

    .line 274
    .line 275
    :goto_3
    return-object v19

    .line 276
    :pswitch_0
    iget-object v2, v1, Lu2/h;->a:Ljava/lang/CharSequence;

    .line 277
    .line 278
    iget v3, v1, Lu2/h;->b:I

    .line 279
    .line 280
    iget-object v4, v1, Lu2/h;->c:Landroid/text/TextPaint;

    .line 281
    .line 282
    iget v5, v1, Lu2/h;->d:I

    .line 283
    .line 284
    invoke-static {v3, v5, v4, v2}, Lk1/f;->c(IILandroid/text/TextPaint;Ljava/lang/CharSequence;)Landroid/text/StaticLayout$Builder;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    iget-object v3, v1, Lu2/h;->e:Landroid/text/TextDirectionHeuristic;

    .line 289
    .line 290
    invoke-static {v2, v3}, Lk1/f;->o(Landroid/text/StaticLayout$Builder;Landroid/text/TextDirectionHeuristic;)V

    .line 291
    .line 292
    .line 293
    iget-object v3, v1, Lu2/h;->f:Landroid/text/Layout$Alignment;

    .line 294
    .line 295
    invoke-static {v2, v3}, Lk1/f;->n(Landroid/text/StaticLayout$Builder;Landroid/text/Layout$Alignment;)V

    .line 296
    .line 297
    .line 298
    iget v3, v1, Lu2/h;->g:I

    .line 299
    .line 300
    invoke-static {v2, v3}, Lk1/f;->C(Landroid/text/StaticLayout$Builder;I)V

    .line 301
    .line 302
    .line 303
    iget-object v3, v1, Lu2/h;->h:Landroid/text/TextUtils$TruncateAt;

    .line 304
    .line 305
    invoke-static {v2, v3}, Lk1/f;->p(Landroid/text/StaticLayout$Builder;Landroid/text/TextUtils$TruncateAt;)V

    .line 306
    .line 307
    .line 308
    iget v3, v1, Lu2/h;->i:I

    .line 309
    .line 310
    invoke-static {v2, v3}, Lk1/f;->D(Landroid/text/StaticLayout$Builder;I)V

    .line 311
    .line 312
    .line 313
    invoke-static {v2}, Lk1/f;->z(Landroid/text/StaticLayout$Builder;)V

    .line 314
    .line 315
    .line 316
    iget-boolean v3, v1, Lu2/h;->k:Z

    .line 317
    .line 318
    invoke-static {v2, v3}, Lk1/f;->q(Landroid/text/StaticLayout$Builder;Z)V

    .line 319
    .line 320
    .line 321
    iget v3, v1, Lu2/h;->l:I

    .line 322
    .line 323
    invoke-static {v2, v3}, Lk1/f;->m(Landroid/text/StaticLayout$Builder;I)V

    .line 324
    .line 325
    .line 326
    iget v3, v1, Lu2/h;->o:I

    .line 327
    .line 328
    invoke-static {v2, v3}, Lk1/f;->A(Landroid/text/StaticLayout$Builder;I)V

    .line 329
    .line 330
    .line 331
    invoke-static {v2}, Lk1/f;->l(Landroid/text/StaticLayout$Builder;)V

    .line 332
    .line 333
    .line 334
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 335
    .line 336
    const/16 v4, 0x1a

    .line 337
    .line 338
    if-lt v3, v4, :cond_3

    .line 339
    .line 340
    iget v4, v1, Lu2/h;->j:I

    .line 341
    .line 342
    invoke-static {v2, v4}, Lp4/q;->i(Landroid/text/StaticLayout$Builder;I)V

    .line 343
    .line 344
    .line 345
    :cond_3
    const/16 v4, 0x1c

    .line 346
    .line 347
    if-lt v3, v4, :cond_4

    .line 348
    .line 349
    invoke-static {v2}, Lb5/z;->p(Landroid/text/StaticLayout$Builder;)V

    .line 350
    .line 351
    .line 352
    :cond_4
    const/16 v4, 0x21

    .line 353
    .line 354
    if-lt v3, v4, :cond_5

    .line 355
    .line 356
    iget v4, v1, Lu2/h;->m:I

    .line 357
    .line 358
    iget v1, v1, Lu2/h;->n:I

    .line 359
    .line 360
    invoke-static {}, Ld/o;->a()Landroid/graphics/text/LineBreakConfig$Builder;

    .line 361
    .line 362
    .line 363
    move-result-object v5

    .line 364
    invoke-static {v5, v4}, Ld/o;->b(Landroid/graphics/text/LineBreakConfig$Builder;I)Landroid/graphics/text/LineBreakConfig$Builder;

    .line 365
    .line 366
    .line 367
    move-result-object v4

    .line 368
    invoke-static {v4, v1}, Ld/o;->q(Landroid/graphics/text/LineBreakConfig$Builder;I)Landroid/graphics/text/LineBreakConfig$Builder;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    invoke-static {v1}, Ld/o;->c(Landroid/graphics/text/LineBreakConfig$Builder;)Landroid/graphics/text/LineBreakConfig;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    invoke-static {v2, v1}, Ld/o;->m(Landroid/text/StaticLayout$Builder;Landroid/graphics/text/LineBreakConfig;)V

    .line 377
    .line 378
    .line 379
    :cond_5
    const/16 v1, 0x23

    .line 380
    .line 381
    if-lt v3, v1, :cond_6

    .line 382
    .line 383
    invoke-static {v2}, Lg5/a;->e(Landroid/text/StaticLayout$Builder;)V

    .line 384
    .line 385
    .line 386
    :cond_6
    invoke-static {v2}, Lk1/f;->d(Landroid/text/StaticLayout$Builder;)Landroid/text/StaticLayout;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    return-object v1

    .line 391
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
.end method

.method public e(Lx2/m;Lx2/k;I)Landroid/graphics/Typeface;
    .locals 4

    .line 1
    iget v0, p0, Lr5/p;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p2, Lx2/k;->a:I

    .line 10
    .line 11
    div-int/lit8 p1, p1, 0x64

    .line 12
    .line 13
    const-string v0, "sans-serif"

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    if-ltz p1, :cond_0

    .line 17
    .line 18
    if-ge p1, v1, :cond_0

    .line 19
    .line 20
    const-string p1, "sans-serif-thin"

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    const/4 v2, 0x4

    .line 24
    if-gt v1, p1, :cond_1

    .line 25
    .line 26
    if-ge p1, v2, :cond_1

    .line 27
    .line 28
    const-string p1, "sans-serif-light"

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    if-ne p1, v2, :cond_3

    .line 32
    .line 33
    :cond_2
    :goto_0
    move-object p1, v0

    .line 34
    goto :goto_1

    .line 35
    :cond_3
    const/4 v1, 0x5

    .line 36
    if-ne p1, v1, :cond_4

    .line 37
    .line 38
    const-string p1, "sans-serif-medium"

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_4
    const/4 v1, 0x6

    .line 42
    const/16 v2, 0x8

    .line 43
    .line 44
    if-gt v1, p1, :cond_5

    .line 45
    .line 46
    if-ge p1, v2, :cond_5

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_5
    if-gt v2, p1, :cond_2

    .line 50
    .line 51
    const/16 v1, 0xb

    .line 52
    .line 53
    if-ge p1, v1, :cond_2

    .line 54
    .line 55
    const-string p1, "sans-serif-black"

    .line 56
    .line 57
    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    const/4 v2, 0x0

    .line 62
    if-nez v1, :cond_6

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_6
    invoke-static {p1, p2, p3}, Lr5/p;->d(Ljava/lang/String;Lx2/k;I)Landroid/graphics/Typeface;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 70
    .line 71
    invoke-static {p2, p3}, Lud/b;->p(Lx2/k;I)I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    invoke-static {v1, v3}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-static {p1, v1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-nez v1, :cond_7

    .line 84
    .line 85
    invoke-static {v2, p2, p3}, Lr5/p;->d(Ljava/lang/String;Lx2/k;I)Landroid/graphics/Typeface;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-static {p1, v1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_7

    .line 94
    .line 95
    move-object v2, p1

    .line 96
    :cond_7
    :goto_2
    if-nez v2, :cond_8

    .line 97
    .line 98
    invoke-static {v0, p2, p3}, Lr5/p;->d(Ljava/lang/String;Lx2/k;I)Landroid/graphics/Typeface;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    :cond_8
    return-object v2

    .line 103
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    const-string p1, "sans-serif"

    .line 107
    .line 108
    invoke-static {p1, p2, p3}, Lr5/p;->c(Ljava/lang/String;Lx2/k;I)Landroid/graphics/Typeface;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    return-object p1

    .line 113
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
    .end packed-switch
    .line 114
.end method

.method public g()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
    .line 3
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

.method public n()V
    .locals 1

    .line 1
    iget v0, p0, Lr5/p;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 10
    .line 11
    .line 12
    throw v0

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public shutdown()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public u(II)Lr5/h0;
    .locals 0

    .line 1
    iget p1, p0, Lr5/p;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lr5/m;

    .line 7
    .line 8
    invoke-direct {p1}, Lr5/m;-><init>()V

    .line 9
    .line 10
    .line 11
    return-object p1

    .line 12
    :pswitch_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 15
    .line 16
    .line 17
    throw p1

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
