.class public abstract Li9/g;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Lub/p;

.field public static final b:Lub/p;

.field public static final c:Lub/p;

.field public static final d:Lub/p;

.field public static final e:Lub/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Le/e;

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    invoke-direct {v0, v1}, Le/e;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lub/a;->d(Lic/a;)Lub/p;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Li9/g;->a:Lub/p;

    .line 13
    .line 14
    new-instance v0, Le/e;

    .line 15
    .line 16
    const/16 v1, 0x1d

    .line 17
    .line 18
    invoke-direct {v0, v1}, Le/e;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lub/a;->d(Lic/a;)Lub/p;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Li9/g;->b:Lub/p;

    .line 26
    .line 27
    new-instance v0, Li9/f;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-direct {v0, v1}, Li9/f;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Lub/a;->d(Lic/a;)Lub/p;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, Li9/g;->c:Lub/p;

    .line 38
    .line 39
    new-instance v0, Li9/f;

    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    invoke-direct {v0, v1}, Li9/f;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, Lub/a;->d(Lic/a;)Lub/p;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sput-object v0, Li9/g;->d:Lub/p;

    .line 50
    .line 51
    new-instance v0, Li9/f;

    .line 52
    .line 53
    const/4 v1, 0x2

    .line 54
    invoke-direct {v0, v1}, Li9/f;-><init>(I)V

    .line 55
    .line 56
    .line 57
    invoke-static {v0}, Lub/a;->d(Lic/a;)Lub/p;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    sput-object v0, Li9/g;->e:Lub/p;

    .line 62
    .line 63
    return-void
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
.end method

.method public static a(Landroid/net/Uri;Ljava/io/OutputStream;)V
    .locals 16

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    const-string v0, "uri"

    .line 4
    .line 5
    move-object/from16 v3, p0

    .line 6
    .line 7
    invoke-static {v3, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sget-object v0, Li9/g;->e:Lub/p;

    .line 11
    .line 12
    invoke-virtual {v0}, Lub/p;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    move-object v15, v0

    .line 17
    check-cast v15, Lt4/f;

    .line 18
    .line 19
    const-string v0, "<this>"

    .line 20
    .line 21
    invoke-static {v15, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :try_start_0
    sget-object v8, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 25
    .line 26
    new-instance v2, Ls4/m;

    .line 27
    .line 28
    const/4 v14, 0x0

    .line 29
    const/4 v13, 0x0

    .line 30
    const-wide/16 v9, 0x0

    .line 31
    .line 32
    const/4 v7, 0x0

    .line 33
    const-wide/16 v4, 0x0

    .line 34
    .line 35
    const/4 v6, 0x1

    .line 36
    const-wide/16 v11, -0x1

    .line 37
    .line 38
    invoke-direct/range {v2 .. v14}, Ls4/m;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v15, v2}, Lt4/f;->f(Ls4/m;)J

    .line 42
    .line 43
    .line 44
    move-result-wide v2

    .line 45
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 46
    .line 47
    .line 48
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    invoke-static {v0}, Lub/a;->b(Ljava/lang/Throwable;)Lub/m;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :goto_0
    instance-of v2, v0, Lub/m;

    .line 56
    .line 57
    if-nez v2, :cond_1

    .line 58
    .line 59
    check-cast v0, Ljava/lang/Number;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 62
    .line 63
    .line 64
    :try_start_1
    sget-object v0, Lna/q;->a:Lub/p;

    .line 65
    .line 66
    const/high16 v0, 0x100000

    .line 67
    .line 68
    new-array v2, v0, [B

    .line 69
    .line 70
    :goto_1
    const/4 v3, 0x0

    .line 71
    invoke-virtual {v15, v2, v3, v0}, Lt4/f;->read([BII)I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    const/4 v5, -0x1

    .line 76
    if-eq v4, v5, :cond_0

    .line 77
    .line 78
    invoke-virtual {v1, v2, v3, v4}, Ljava/io/OutputStream;->write([BII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :catchall_1
    move-exception v0

    .line 83
    move-object v2, v0

    .line 84
    goto :goto_2

    .line 85
    :cond_0
    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    .line 86
    .line 87
    .line 88
    goto :goto_3

    .line 89
    :goto_2
    :try_start_2
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 90
    :catchall_2
    move-exception v0

    .line 91
    invoke-static {v1, v2}, La/a;->w(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    throw v0

    .line 95
    :cond_1
    :goto_3
    invoke-virtual {v15}, Lt4/f;->close()V

    .line 96
    .line 97
    .line 98
    return-void
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
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
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
.end method
