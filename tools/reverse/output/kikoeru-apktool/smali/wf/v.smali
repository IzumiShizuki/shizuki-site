.class public final Lwf/v;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lsf/a;


# static fields
.field public static final a:Lwf/v;

.field public static final b:Lwf/f1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lwf/v;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lwf/v;->a:Lwf/v;

    .line 7
    .line 8
    new-instance v0, Lwf/f1;

    .line 9
    .line 10
    const-string v1, "kotlin.time.Duration"

    .line 11
    .line 12
    sget-object v2, Luf/e;->j:Luf/e;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Lwf/f1;-><init>(Ljava/lang/String;Luf/f;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lwf/v;->b:Lwf/f1;

    .line 18
    .line 19
    return-void
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


# virtual methods
.method public final a()Luf/g;
    .locals 1

    .line 1
    sget-object v0, Lwf/v;->b:Lwf/f1;

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

.method public final b(Lvf/b;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget v0, Lff/a;->d:I

    .line 2
    .line 3
    invoke-interface {p1}, Lvf/b;->r()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "value"

    .line 8
    .line 9
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :try_start_0
    invoke-static {p1}, Lff/f;->a(Ljava/lang/String;)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    new-instance p1, Lff/a;

    .line 17
    .line 18
    invoke-direct {p1, v0, v1}, Lff/a;-><init>(J)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :catch_0
    move-exception v0

    .line 23
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 24
    .line 25
    const-string v2, "Invalid ISO duration string format: \'"

    .line 26
    .line 27
    const-string v3, "\'."

    .line 28
    .line 29
    invoke-static {v2, p1, v3}, Lq/t0;->D(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-direct {v1, p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    throw v1
.end method

.method public final d(Lyf/t;Ljava/lang/Object;)V
    .locals 16

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    check-cast v0, Lff/a;

    .line 4
    .line 5
    iget-wide v0, v0, Lff/a;->a:J

    .line 6
    .line 7
    sget v2, Lff/a;->d:I

    .line 8
    .line 9
    new-instance v3, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-wide/16 v4, 0x0

    .line 15
    .line 16
    cmp-long v2, v0, v4

    .line 17
    .line 18
    if-gez v2, :cond_0

    .line 19
    .line 20
    const/16 v6, 0x2d

    .line 21
    .line 22
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    :cond_0
    const-string v6, "PT"

    .line 26
    .line 27
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    if-gez v2, :cond_1

    .line 31
    .line 32
    invoke-static {v0, v1}, Lff/a;->i(J)J

    .line 33
    .line 34
    .line 35
    move-result-wide v6

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move-wide v6, v0

    .line 38
    :goto_0
    sget-object v2, Lff/c;->f:Lff/c;

    .line 39
    .line 40
    invoke-static {v6, v7, v2}, Lff/a;->h(JLff/c;)J

    .line 41
    .line 42
    .line 43
    move-result-wide v8

    .line 44
    invoke-static {v6, v7}, Lff/a;->f(J)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    const/16 v10, 0x3c

    .line 49
    .line 50
    const/4 v11, 0x0

    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    sget-object v2, Lff/c;->e:Lff/c;

    .line 56
    .line 57
    invoke-static {v6, v7, v2}, Lff/a;->h(JLff/c;)J

    .line 58
    .line 59
    .line 60
    move-result-wide v12

    .line 61
    int-to-long v14, v10

    .line 62
    rem-long/2addr v12, v14

    .line 63
    long-to-int v2, v12

    .line 64
    :goto_1
    invoke-static {v6, v7}, Lff/a;->f(J)Z

    .line 65
    .line 66
    .line 67
    move-result v12

    .line 68
    if-eqz v12, :cond_3

    .line 69
    .line 70
    const/4 v10, 0x0

    .line 71
    goto :goto_2

    .line 72
    :cond_3
    sget-object v12, Lff/c;->d:Lff/c;

    .line 73
    .line 74
    invoke-static {v6, v7, v12}, Lff/a;->h(JLff/c;)J

    .line 75
    .line 76
    .line 77
    move-result-wide v12

    .line 78
    int-to-long v14, v10

    .line 79
    rem-long/2addr v12, v14

    .line 80
    long-to-int v10, v12

    .line 81
    :goto_2
    invoke-static {v6, v7}, Lff/a;->e(J)I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    invoke-static {v0, v1}, Lff/a;->f(J)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_4

    .line 90
    .line 91
    const-wide v8, 0x9184e729fffL

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    :cond_4
    const/4 v0, 0x1

    .line 97
    cmp-long v1, v8, v4

    .line 98
    .line 99
    if-eqz v1, :cond_5

    .line 100
    .line 101
    const/4 v1, 0x1

    .line 102
    goto :goto_3

    .line 103
    :cond_5
    const/4 v1, 0x0

    .line 104
    :goto_3
    if-nez v10, :cond_7

    .line 105
    .line 106
    if-eqz v6, :cond_6

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_6
    const/4 v4, 0x0

    .line 110
    goto :goto_5

    .line 111
    :cond_7
    :goto_4
    const/4 v4, 0x1

    .line 112
    :goto_5
    if-nez v2, :cond_8

    .line 113
    .line 114
    if-eqz v4, :cond_9

    .line 115
    .line 116
    if-eqz v1, :cond_9

    .line 117
    .line 118
    :cond_8
    const/4 v11, 0x1

    .line 119
    :cond_9
    if-eqz v1, :cond_a

    .line 120
    .line 121
    invoke-virtual {v3, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const/16 v0, 0x48

    .line 125
    .line 126
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    :cond_a
    if-eqz v11, :cond_b

    .line 130
    .line 131
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    const/16 v0, 0x4d

    .line 135
    .line 136
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    :cond_b
    if-nez v4, :cond_c

    .line 140
    .line 141
    if-nez v1, :cond_d

    .line 142
    .line 143
    if-nez v11, :cond_d

    .line 144
    .line 145
    :cond_c
    const-string v7, "S"

    .line 146
    .line 147
    const/4 v8, 0x1

    .line 148
    move v5, v6

    .line 149
    const/16 v6, 0x9

    .line 150
    .line 151
    move v4, v10

    .line 152
    invoke-static/range {v3 .. v8}, Lff/a;->b(Ljava/lang/StringBuilder;IIILjava/lang/String;Z)V

    .line 153
    .line 154
    .line 155
    :cond_d
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    move-object/from16 v1, p1

    .line 160
    .line 161
    invoke-virtual {v1, v0}, Lyf/t;->u(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    return-void
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
