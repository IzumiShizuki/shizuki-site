.class public final Li7/c;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Llf/g;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Llf/g;

.field public final synthetic c:Ljc/w;


# direct methods
.method public constructor <init>(Ljc/w;Llf/g;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Li7/c;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li7/c;->c:Ljc/w;

    iput-object p2, p0, Li7/c;->b:Llf/g;

    return-void
.end method

.method public constructor <init>(Llf/g;Ljc/w;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Li7/c;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li7/c;->b:Llf/g;

    iput-object p2, p0, Li7/c;->c:Ljc/w;

    return-void
.end method


# virtual methods
.method public a(Lvb/u;Lyb/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Li7/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Li7/b;

    .line 7
    .line 8
    iget v1, v0, Li7/b;->h:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Li7/b;->h:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Li7/b;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Li7/b;-><init>(Li7/c;Lyb/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Li7/b;->f:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Li7/b;->h:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object p1, v0, Li7/b;->e:Lvb/u;

    .line 35
    .line 36
    iget-object v0, v0, Li7/b;->d:Li7/c;

    .line 37
    .line 38
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget p2, p1, Lvb/u;->a:I

    .line 57
    .line 58
    iget-object v1, p0, Li7/c;->c:Ljc/w;

    .line 59
    .line 60
    iget v1, v1, Ljc/w;->a:I

    .line 61
    .line 62
    if-le p2, v1, :cond_4

    .line 63
    .line 64
    iget-object p2, p1, Lvb/u;->b:Ljava/lang/Object;

    .line 65
    .line 66
    iput-object p0, v0, Li7/b;->d:Li7/c;

    .line 67
    .line 68
    iput-object p1, v0, Li7/b;->e:Lvb/u;

    .line 69
    .line 70
    iput v2, v0, Li7/b;->h:I

    .line 71
    .line 72
    iget-object v1, p0, Li7/c;->b:Llf/g;

    .line 73
    .line 74
    invoke-interface {v1, p2, v0}, Llf/g;->n(Ljava/lang/Object;Lyb/c;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    sget-object v0, Lzb/a;->a:Lzb/a;

    .line 79
    .line 80
    if-ne p2, v0, :cond_3

    .line 81
    .line 82
    return-object v0

    .line 83
    :cond_3
    move-object v0, p0

    .line 84
    :goto_1
    iget-object p2, v0, Li7/c;->c:Ljc/w;

    .line 85
    .line 86
    iget p1, p1, Lvb/u;->a:I

    .line 87
    .line 88
    iput p1, p2, Ljc/w;->a:I

    .line 89
    .line 90
    :cond_4
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 91
    .line 92
    return-object p1
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

.method public final n(Ljava/lang/Object;Lyb/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Li7/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of v0, p2, Llf/g0;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, Llf/g0;

    .line 12
    .line 13
    iget v1, v0, Llf/g0;->f:I

    .line 14
    .line 15
    const/high16 v2, -0x80000000

    .line 16
    .line 17
    and-int v3, v1, v2

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    sub-int/2addr v1, v2

    .line 22
    iput v1, v0, Llf/g0;->f:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Llf/g0;

    .line 26
    .line 27
    invoke-direct {v0, p0, p2}, Llf/g0;-><init>(Li7/c;Lyb/c;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p2, v0, Llf/g0;->d:Ljava/lang/Object;

    .line 31
    .line 32
    iget v1, v0, Llf/g0;->f:I

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_2
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    new-instance p2, Lvb/u;

    .line 55
    .line 56
    iget-object v1, p0, Li7/c;->c:Ljc/w;

    .line 57
    .line 58
    iget v3, v1, Ljc/w;->a:I

    .line 59
    .line 60
    add-int/lit8 v4, v3, 0x1

    .line 61
    .line 62
    iput v4, v1, Ljc/w;->a:I

    .line 63
    .line 64
    if-ltz v3, :cond_4

    .line 65
    .line 66
    invoke-direct {p2, v3, p1}, Lvb/u;-><init>(ILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iput v2, v0, Llf/g0;->f:I

    .line 70
    .line 71
    iget-object p1, p0, Li7/c;->b:Llf/g;

    .line 72
    .line 73
    invoke-interface {p1, p2, v0}, Llf/g;->n(Ljava/lang/Object;Lyb/c;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    sget-object p2, Lzb/a;->a:Lzb/a;

    .line 78
    .line 79
    if-ne p1, p2, :cond_3

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    :goto_1
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 83
    .line 84
    :goto_2
    return-object p2

    .line 85
    :cond_4
    new-instance p1, Ljava/lang/ArithmeticException;

    .line 86
    .line 87
    const-string p2, "Index overflow has happened"

    .line 88
    .line 89
    invoke-direct {p1, p2}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw p1

    .line 93
    :pswitch_0
    check-cast p1, Lvb/u;

    .line 94
    .line 95
    invoke-virtual {p0, p1, p2}, Li7/c;->a(Lvb/u;Lyb/c;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    return-object p1

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
